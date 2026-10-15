
package com.gridpilot.gridpilot_backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class GridReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double voltage;
    private double currentValue;
    private double frequency;
    private String status;
    private LocalDateTime recordedAt;

    public GridReading() {
    }

    public Long getId() {
        return id;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }
}
