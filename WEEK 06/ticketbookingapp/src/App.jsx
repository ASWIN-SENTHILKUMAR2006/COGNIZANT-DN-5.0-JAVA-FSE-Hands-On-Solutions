import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h1>Ticket Booking App</h1>
      <div style={{ marginBottom: '15px' }}>
        {button}
      </div>
      <hr />
      <Greeting isLoggedIn={isLoggedIn} />
    </div>
  );
}

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function GuestGreeting() {
  const flights = [
    { id: 101, flightNo: "AI-202", origin: "Delhi", destination: "Mumbai", price: "₹4,500" },
    { id: 102, flightNo: "6E-534", origin: "Chennai", destination: "Bangalore", price: "₹3,200" },
    { id: 103, flightNo: "UK-811", origin: "Hyderabad", destination: "Delhi", price: "₹5,100" }
  ];

  return (
    <div>
      <h2>Flight Details (Guest View)</h2>
      <p>Please log in to book tickets.</p>
      <table border="1" cellPadding="8" cellSpacing="0">
        <thead>
          <tr>
            <th>Flight No</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {flights.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.flightNo}</td>
              <td>{flight.origin}</td>
              <td>{flight.destination}</td>
              <td>{flight.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

function UserGreeting() {
  const flights = [
    { id: 101, flightNo: "AI-202", origin: "Delhi", destination: "Mumbai", price: "₹4,500" },
    { id: 102, flightNo: "6E-534", origin: "Chennai", destination: "Bangalore", price: "₹3,200" },
    { id: 103, flightNo: "UK-811", origin: "Hyderabad", destination: "Delhi", price: "₹5,100" }
  ];

  const handleBook = (flightNo) => {
    alert(`Ticket successfully booked for flight ${flightNo}!`);
  };

  return (
    <div>
      <h2>Welcome Back! (User View)</h2>
      <p>Select a flight to book your ticket:</p>
      <table border="1" cellPadding="8" cellSpacing="0">
        <thead>
          <tr>
            <th>Flight No</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Price</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {flights.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.flightNo}</td>
              <td>{flight.origin}</td>
              <td>{flight.destination}</td>
              <td>{flight.price}</td>
              <td>
                <button onClick={() => handleBook(flight.flightNo)}>Book Ticket</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}


export default App;