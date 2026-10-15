
package com.gridpilot.gridpilot_backend;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {
    "http://127.0.0.1:5500",
    "http://localhost:5500"
})
public class GridPilotController {

    private final GridReadingRepository repository;

    public GridPilotController(GridReadingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/status")
    public Map<String, String> getStatus() {
        return Map.of(
            "project", "GridPilot",
            "status", "Backend Running"
        );
    }

    @GetMapping("/api/grid-data")
    public Map<String, Object> getGridData() {
        List<GridReading> readings = repository.findAll();

        if (readings.isEmpty()) {
            return Map.of(
                "voltage", 230.0,
                "current", 10.0,
                "frequency", 50.0,
                "status", "NORMAL"
            );
        }

        GridReading latest = readings.get(readings.size() - 1);

        return Map.of(
            "voltage", latest.getVoltage(),
            "current", latest.getCurrentValue(),
            "frequency", latest.getFrequency(),
            "status", latest.getStatus()
        );
    }

    @PostMapping("/api/grid-data/save")
    public GridReading saveGridData(
            @RequestBody Map<String, Object> data) {

        GridReading reading = new GridReading();

        reading.setVoltage(
            Double.parseDouble(data.get("voltage").toString())
        );
        reading.setCurrentValue(
            Double.parseDouble(data.get("current").toString())
        );
        reading.setFrequency(
            Double.parseDouble(data.get("frequency").toString())
        );

        double voltage = reading.getVoltage();

        String status;
        if (voltage < 200 || voltage > 250) {
            status = "CRITICAL";
        } else if (voltage < 220 || voltage > 240) {
            status = "WARNING";
        } else {
            status = "NORMAL";
        }

        reading.setStatus(status);
        reading.setRecordedAt(LocalDateTime.now());

        return repository.save(reading);
    }

    @GetMapping("/api/grid-data/history")
    public List<GridReading> getHistory() {
        return repository.findAll();
    }
}
