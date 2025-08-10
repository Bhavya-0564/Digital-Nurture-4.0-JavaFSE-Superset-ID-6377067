import React from 'react';

const ScoreBelow70 = ({ players }) => {
  const players70 = [];
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
  });

  return (
    <div>
      {players70.map((player, index) => (
        <li key={index}>Mr. {player.name}</li>
      ))}
    </div>
  );
};

export default ScoreBelow70;
