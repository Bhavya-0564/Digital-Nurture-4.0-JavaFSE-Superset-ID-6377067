import React, { useState } from "react";

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function UserGreeting() {
  return <h2>Welcome back</h2>;
}

function GuestGreeting() {
  return <h2>Please sign up.</h2>;
}

function Greeting({ isLoggedIn }) {
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function TicketPage({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? (
        <p>You can now book tickets!</p>
      ) : (
        <p>You can only view available flights.</p>
      )}
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
      <TicketPage isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;
