
# GridPilot – Testing Report

## 1. Project Overview

GridPilot is a web-based Smart Power Grid Monitoring and Management System developed using HTML, CSS, JavaScript, Bootstrap, Java, Spring Boot, and MySQL.

The system displays electrical parameters such as voltage, current, frequency, and calculated power. It provides REST API endpoints for retrieving and saving readings and stores historical records in a MySQL database.

## 2. Testing Objectives

- Verify frontend dashboard data display.
- Verify communication between the frontend and backend API.
- Verify Spring Boot backend connectivity.
- Verify MySQL database connectivity and data persistence.
- Test voltage-based status classification.
- Verify saved reading history.
- Check the main API endpoints.

## 3. Test Cases

| Test ID | Test Input | Expected Status | Purpose |
|---|---|---|---|
| TC-01 | 230 V, 10 A, 50 Hz | NORMAL | Verify normal voltage classification |
| TC-02 | 245 V, 15 A, 50 Hz | WARNING | Verify warning voltage classification |
| TC-03 | 260 V, 50 A, 10 Hz | CRITICAL | Verify critical voltage classification |

Note: The current backend classifies status based on voltage thresholds only. Current and frequency are recorded and displayed but are not used in the current status calculation.

## 4. Functional Verification

### 4.1 Frontend Dashboard

- The dashboard was opened using the local development server.
- Voltage, current, and calculated power values were displayed.
- The dashboard retrieved readings from the backend API.
- The dashboard refreshes periodically.

### 4.2 Backend API

- The backend application started successfully.
- The `/api/status` endpoint was used to check backend availability.
- The `/api/grid-data` endpoint returned grid reading data.
- The `/api/grid-data/save` endpoint accepted and saved a reading.
- The `/api/grid-data/history` endpoint returned saved readings.

### 4.3 Database Verification

- The backend connected to MySQL successfully.
- Grid readings were saved to the database.
- The reading history endpoint returned stored records.
- Multiple saved records were observed during testing.

### 4.4 Version Control Verification

- Backend source files were committed and pushed to GitHub.
- The project source code is maintained in the GridPilot repository.
- Project documentation is maintained in Markdown format.

## 5. Technology Stack

- Frontend: HTML, CSS, JavaScript, Bootstrap
- Backend: Java, Spring Boot
- Database: MySQL
- API: REST API
- Build Tool: Maven
- Development Tools: Visual Studio Code, MySQL Workbench
- Version Control: Git and GitHub

## 6. Limitations

- The current dashboard uses simulated demonstration readings.
- Physical electrical sensors have not yet been integrated.
- Status classification is based on voltage thresholds only.
- Current and frequency are not included in the current status calculation.
- Threshold values are used for software demonstration and testing only.
- The application is not a certified electrical protection or grid-control system.

## 7. Future Enhancements

- Integrate suitable physical voltage and current sensors.
- Add real-time electrical data acquisition.
- Display historical readings using charts.
- Add automated API and integration tests.
- Implement user authentication and access control.
- Add configurable alerts and notifications.
- Explore cloud deployment and remote monitoring.

## 8. Conclusion

The GridPilot software demonstration displays simulated electrical readings through a web dashboard, communicates with a Spring Boot REST API, and stores and retrieves reading history using MySQL.

The current implementation demonstrates the basic software architecture for grid monitoring. Physical sensor integration and further testing are required before it can be considered a real-time electrical monitoring system.

## Author

Sunmathi P.

GitHub: https://github.com/PalanivelSunmathi/GridPilot
