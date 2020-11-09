[![Build Status](https://travis-ci.com/anasabbdelrahman/ALTENVehiclesMonitoring.svg?branch=main)](https://travis-ci.com/anasabbdelrahman/ALTENVehiclesMonitoring)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=anasabbdelrahman_ALTENVehiclesMonitoring&metric=alert_status)](https://sonarcloud.io/dashboard?id=anasabbdelrahman_ALTENVehiclesMonitoring)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=anasabbdelrahman_ALTENVehiclesMonitoring&metric=bugs)](https://sonarcloud.io/dashboard?id=anasabbdelrahman_ALTENVehiclesMonitoring)

[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=anasabbdelrahman_ALTENVehiclesMonitoring&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=anasabbdelrahman_ALTENVehiclesMonitoring)

[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=anasabbdelrahman_ALTENVehiclesMonitoring&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=anasabbdelrahman_ALTENVehiclesMonitoring)


# **Vehicle Management Challenge**

**Vehicle management Challenge** refers to an application that helps business enterprises coordinate and manage work vehicles in a central information system for the smooth functioning of the entire organization.

The aim of this challenge is simply to provide a system that can manage a group of commercial vehicles over a large geographical area.
It might include handling of vehicle maintenance, financing, tracking, replacement, navigation, and routing.


<p align="center">
<img src="imags/vmc_main.png" width="800">
</p>


## **System Overview**

A company has the following:
1. A number of connected vehicles that belongs to a number of customers.
2. They have a need to be able to view the status of the connection among these vehicles on a monitoring display.
3. The vehicles send the status of the connection one time per minute.
4. The status can be compared with a ping (network trace); no request from the vehicle means no connection.



## **The Challenge**

Create a data store that keeps these vehicles with their status and the customers who own them, as well as a GUI (preferably web-based) that displays the status.

> Note: How the GUI is designed is up to you, as well as how you chose to implement the features and use suitable technologies.

Obviously, for this task, there are no real vehicles available that can respond to your "ping" request.
This can either be solved by using static values or ​​by creating a separate machinery that returns random fake status.


## **System Requirements**
1. Web GUI (Single Page Application Framework/Platform).
 - An overview of all vehicles should be visible on one page (full-screen display), together with their status.
 - It should be able to filter, to only show vehicles for a specific customer.
 - It should be able to filter, to only show vehicles that have a specific status.
2. Random simulation to vehicles status sending.
3. If database design will consume a lot of time, use data in-memory representation.
4. Unit Testing.
5. .NET Core, Java or any native language.
6. Complete analysis for the problem.
 - Full architectural sketch to solution.
 - Analysis behind the solution design, technologies,....
 - How the solution will make use of cloud.
 - Deployment steps.

## **Optional Requirements**
1. Write an integration tests.
2. Write an automation test.
3. Use CI(Travis, Circle, TeamCity...) to verify your code (Static analysis,..) and tests.
4. Dockerize the whole solution.
5. Microservices architecture for driver, vehicle and FaaS APIs.
 - Use any Microservices Chassis Framework.
6. Explain if it is possible to be in Serverless architecture and how?

## **Data**

Below you have all customers from the system; their addresses and the vehicles they own.

### Customer (1):

**Kalles Grustransporter AB**

**Cementvägen 8, 111 11 Södertälje**

| VIN (VehicleId)   | Reg. nr. |
| ----------------- | -------- |
| YS2R4X20005399401 | ABC123   |
| VLUR4X20009093588 | DEF456   |
| VLUR4X20009048066 | GHI789   |

### Customer (2):

**Johans Bulk AB**

**Balkvägen 12, 222 22 Stockholm**

| VIN (VehicleId)   | Reg. nr. |
| ----------------- | -------- |
| YS2R4X20005388011 | JKL012   |
| YS2R4X20005387949 | MNO345   |

### Customer (3):

**Haralds Värdetransporter AB**

**Budgetvägen 1, 333 33 Uppsala**

| VIN (VehicleId)   | Reg. nr. |
| ----------------- | -------- |
| VLUR4X20009048066 | PQR678   |
| YS2R4X20005387055 | STU901   |


# **Architectural sketch to solution**

# **Analysis and technologies**

# **Cloud Solution**

# **Deployment steps**

# **API Documentation**

- **Customer API:** [http://localhost:8051/swagger-ui.html](http://localhost:8051/swagger-ui.html 'http://localhost:8051/swagger-ui.html')
  ![Alt text](imags/vmc_customer_api.png?raw=true 'customer api')
  
- **Vehicle API:** [http://localhost:8050/swagger-ui.html](http://localhost:8050/swagger-ui.html 'http://localhost:8050/swagger-ui.html')
  ![Alt text](imags/vmc_vehicle_api.png?raw=true 'vehicle api')

- **Status API:** [http://localhost:8052/swagger-ui.html](http://localhost:8052/swagger-ui.html 'http://localhost:8052/swagger-ui.html')
  ![Alt text](imags/vmc_status_api.png?raw=true 'status api')