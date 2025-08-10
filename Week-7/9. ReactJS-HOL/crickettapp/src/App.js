import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import ScoreBelow70 from './components/ScoreBelow70';
import { OddPlayers } from './components/OddPlayers';
import { EvenPlayers } from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';

function App() {
  const flag = true;

  const players = [
    { name: 'Jack', score: 70 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 60 },
    { name: 'Ava', score: 68 },
    { name: 'Elizabeth', score: 61 },
    { name: 'Jaden', score: 44 },
    { name: 'Mia', score: 66 },
    { name: 'Liam', score: 54 },
    { name: 'Rain', score: 75 },
    { name: 'Ruby', score: 80 },
    { name: 'Robin', score: 55 }
  ];

  const IndianTeam = ['Sehwag', 'Dhoni', 'Virat', 'Rahul', 'Yuvraj', 'Raina'];

  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>
        <h2>Odd Players</h2>
        <OddPlayers first={IndianTeam} />
        <hr />
        <h2>Even Players</h2>
        <EvenPlayers first={IndianTeam} />
        <hr />
        <h2>List of Indian Players Merged</h2>
        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;
