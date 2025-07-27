import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohort = {
    name: "Gen-AI Mastery",
    status: "ongoing"
  };

  return (
    <div>
      <CohortDetails cohort={cohort} />
    </div>
  );
}

export default App;
