import React from 'react';

// Destructuring Odd Team Players
export function OddPlayers([first, , third, , fifth]) {
  return (
    <div>
      <h3>Odd Team Players</h3>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
}

// Destructuring Even Team Players
export function EvenPlayers([, second, , fourth, , sixth]) {
  return (
    <div>
      <h3>Even Team Players</h3>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
}

// Merge T20 and Ranji Trophy arrays using ES6 Spread syntax
const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export function IndianPlayersComponent() {
  return (
    <div>
      <h2>Indian Players</h2>
      
      {/* Destructured Odd and Even Displays */}
      {OddPlayers(IndianPlayers)}
      {EvenPlayers(IndianPlayers)}

      <hr />

      {/* Merged Array Display */}
      <h3>Merged Indian Players List (T20 + Ranji)</h3>
      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}