import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Table from 'react-responsive-data-table';
import { render } from "react-dom";
import logo from './logo.svg';



render(
  
  <Table
    style={{
      opacity: 0.8,
      backgroundColor: "#00113a",
      color: "#ffffff",
      textAlign: "center"
    }}
    tableStyle="table table-hover table-striped table-bordered table-borderless table-responsive"
    pages={true}
    onRowClick={row => console.log(row)}
    pagination={true}
    page={true}
    title="Admin Page"
    search={true}
    errormsg="Error. . ."
    loadingmsg="Loading. . ."
    isLoading={false}
    sort={true}
    //totalPages={27}  removed
    size={10}
    data={{
      head: {
        customerName: "Customer Name",
        address: "Address",
        vehicleid: "Vehicle ID",
        regnum: "Reg. Number",
        status: "Status"
      },
      data: [
        {
          customerName: "Kalles Grustransporter AB",
          address: "Cementvägen 8, 111 11 Södertälje",
          vehicleid: "YS2R4X20005399401",
          regnum: "ABC123",
          status: "CONNECTED"
        },
        {
          customerName: "Kalles Grustransporter AB",
          address: "Cementvägen 8, 111 11 Södertälje",
          vehicleid: "VLUR4X20009093588",
          regnum: "DEF456",
          status: "DISCONNECTED"
        },
        {
          customerName: "Kalles Grustransporter AB",
          address: "Cementvägen 8, 111 11 Södertälje",
          vehicleid: "VLUR4X20009048066",
          regnum: "GHI789",
          status: "CONNECTED"
        },
        {
          customerName: "Johans Bulk AB",
          address: "Balkvägen 12, 222 22 Stockholm",
          vehicleid: "YS2R4X20005388011",
          regnum: "JKL012",
          status: "CONNECTED"
        },
        {
          customerName: "Johans Bulk AB",
          address: "Balkvägen 12, 222 22 Stockholm",
          vehicleid: "YS2R4X20005387949",
          regnum: "MNO345",
          status: "DISCONNECTED"
        },
        {
          customerName: "Haralds Värdetransporter AB",
          address: "Budgetvägen 1, 333 33 Uppsala",
          vehicleid: "YS2R4X20005387765",
          regnum: "PQR678",
          status: "DISCONNECTED"
        },
        {
          customerName: "Haralds Värdetransporter AB",
          address: "Budgetvägen 1, 333 33 Uppsala",
          vehicleid: "YS2R4X20005387055",
          regnum: "STU901",
          status: "CONNECTED"
        }
      ]
    }}
  /> ,
  document.getElementById("root")
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
