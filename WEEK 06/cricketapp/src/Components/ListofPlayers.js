import React from 'react';


const players = [
  { name: 'Jack', score: 50 },
  { name: 'Steve', score: 70 },
  { name: 'Rahul', score: 85 },
  { name: 'Sachin', score: 95 },
  { name: 'Virat', score: 90 },
  { name: 'Dhoni', score: 88 },
  { name: 'Rohit', score: 65 },
  { name: 'Gill', score: 72 },
  { name: 'Hardik', score: 60 },
  { name: 'Bumrah', score: 45 },
  { name: 'Shami', score: 55 }
];

export function ListofPlayers() {
 
  const players70 = players.filter((item) => item.score <= 70);

  return (
    <div>
      <h2>List of All Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>

      <hr />

      <h2>List of Players with Score Below or Equal to 70</h2>
      <ul>
        {players70.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}