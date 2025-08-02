import { useState } from 'react';
import UserPage from './UserPage';
import GuestPage from './GuestPage';

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div>
      <h1>Ticket Booking App</h1>
      <button onClick={() => setLoggedIn(!loggedIn)}>
        {loggedIn ? 'Logout' : 'Login'}
      </button>
      {loggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
