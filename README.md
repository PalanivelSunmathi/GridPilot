# GridPilot – Smart Power Grid Monitoring System

GridPilot is a web-based power grid monitoring and management project developed to display electrical readings, identify demonstration alert conditions, and maintain historical reading records.

## Project Objectives

- Monitor voltage, current, and frequency readings.
- Display grid status using NORMAL, WARNING, and CRITICAL categories.
- Store readings in a MySQL database.
- View previous readings through a dashboard.
- Provide a foundation for future real-time electrical sensor integration.

## Features

- Dashboard with electrical measurement cards
- Grid status and alert messages
- Add test readings
- Historical readings table
- Status filtering and CSV export
- Spring Boot REST API
- MySQL data storage

## Technology Stack

| Layer | Technology |
|---|---|
| Frontend | HTML, CSS, JavaScript, Bootstrap |
| Backend | Java, Spring Boot |
| Database | MySQL |
| Build Tool | Maven |
| Version Control | Git and GitHub |

## Project Structure

```text
GridPilot/
├── backend/
├── database/
├── docs/
│   └── TESTING_REPORT.md
├── frontend/
├── tests/
└── README.md
```

## Backend Setup

1. Install Java 21 and MySQL.
2. Configure the database connection in the backend application configuration.
3. Open a terminal in the backend project directory.
4. Run the application using the Maven wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

5. Open `http://localhost:8080/api/status` to check the backend response.

## Main API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/status` | Check backend status |
| GET | `/api/grid-data` | Retrieve grid readings |
| POST | `/api/grid-data/save` | Save a reading |
| GET | `/api/grid-data/history` | Retrieve reading history |

## Testing

The backend API and dashboard data display have been manually checked. Refer to `docs/TESTING_REPORT.md` for the testing summary.

## Important Limitation

This project currently uses demonstration readings and demo status thresholds. Real electrical sensor integration and certified grid protection logic are not claimed as implemented.

## Future Enhancements

- Integration with real electrical sensors
- Live data visualization and trend analysis
- Automated API testing
- User authentication and access control
- Cloud deployment

## Author

**Sunmathi P.**

GitHub: [PalanivelSunmathi](https://github.com/PalanivelSunmathi)