import React from 'react';
import { ListofPlayers } from './Components/ListofPlayers';
import { IndianPlayersComponent } from './Components/IndianPlayers';

function App() {
  const flag = true; // Toggle between true and false to switch views

  if (flag) {
    return (
      <div>
        <ListofPlayers />
      </div>
    );
  } else {
    return (
      <div>
        <IndianPlayersComponent />
      </div>
    );
  }
}

export default App;