// src/Components/CalculateScore.js

const calcScore = (total, goal) => {
  if (goal === 0) return 'Goal cannot be zero';
  const percentage = (total / goal) * 100;
  return `${percentage.toFixed(2)}%`;
};

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="center-container">
    <div className="formatstyle">
      <h1><font color="Brown">Student Details:</font></h1>

      <div className="Name">
        <b><span> Name: </span></b>
        <span>{Name}</span>
      </div>

      <div className="School">
        <b><span> School: </span></b>
        <span>{School}</span>
      </div>

      <div className="Total">
        <b><span>Total:</span></b>
        <span>{total}</span>
        <span> Marks</span>
      </div>

      <div className="Score">
        <b>Score:</b>
        <span> {calcScore(total, goal)} </span>
      </div>
    </div>
  </div>
);
