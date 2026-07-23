import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";

  const sr = "https://images.unsplash.com/photo-1497366216548-37526070297c?w=500";
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  const ItemName = { Name: "DBS", Rent: 50000, Address: "Chennai" };

  const singleRentClass = ItemName.Rent <= 60000 ? 'textRed' : 'textGreen';

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "FastMove", Rent: 75000, Address: "Bangalore" },
    { Name: "WorkSpot", Rent: 55000, Address: "Hyderabad" },
    { Name: "HubSpot", Rent: 90000, Address: "Mumbai" }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}

      <hr />

      <h2>Featured Office</h2>
      <div className="office-card">
        <h1>Name: {ItemName.Name}</h1>
        <h3 className={singleRentClass}>Rent: Rs. {ItemName.Rent}</h3>
        <h3>Address: {ItemName.Address}</h3>
      </div>

      <hr />

      <h2>Available Office Spaces</h2>
      {officeList.map((office, index) => {
        const rentClass = office.Rent <= 60000 ? 'textRed' : 'textGreen';

        return (
          <div key={index} className="office-card">
            <h1>Name: {office.Name}</h1>
            <h3 className={rentClass}>Rent: Rs. {office.Rent}</h3>
            <h3>Address: {office.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;