\# GridPilot – Testing Report



\## 1. Project Overview

GridPilot is a Smart Power Grid Monitoring and Management System developed using Java, Spring Boot, MySQL, HTML, CSS, JavaScript, and Bootstrap.



\## 2. Testing Objectives

\- Verify backend API connectivity.

\- Verify dashboard data display.

\- Verify MySQL database connectivity.

\- Test demo voltage status classification.

\- Verify reading history.



\## 3. Test Cases



| Test ID | Input | Expected Status |

|---|---|---|

| TC-01 | 230 V, 10 A, 50 Hz | NORMAL |

| TC-02 | 235 V, 15 A, 50 Hz | WARNING |

| TC-03 | 260 V, 50 A, 10 Hz | CRITICAL |



\## 4. Verification

\- Backend API response was checked.

\- Voltage, current, and frequency were displayed on the dashboard.

\- Different test readings were entered.



\## 5. Technology Stack

\- Frontend: HTML, CSS, JavaScript, Bootstrap

\- Backend: Java, Spring Boot

\- Database: MySQL

\- Build Tool: Maven



\## 6. Limitation

The readings and status thresholds are used for demonstration. Real electrical sensor integration has not yet been confirmed.



\## 7. Future Enhancements

\- Real-time sensor integration

\- Improved automated API testing

\- User authentication

\- Cloud deployment

