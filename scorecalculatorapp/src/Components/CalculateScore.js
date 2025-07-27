import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Srinika";
  const school = "GRIET";
  const total = 500;
  const goal = 600;

  const avg = (total / goal) * 100;

  return (
    <div className="box">
      <h2>Score Calculator</h2>
      <p>Name: {name}</p>
      <p>School: {school}</p>
      <p>Average Score: {avg.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
