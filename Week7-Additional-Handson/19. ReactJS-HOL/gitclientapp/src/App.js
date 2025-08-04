import React, { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repositories, setRepositories] = useState([]);

  useEffect(() => {
    GitClient.getRepositories("techieSyed").then((res) =>
      setRepositories(res.data)
    );
  }, []);

  return (
    <div className="App">
      <h1>Git repositories of User - TechieSyed</h1>
      {repositories.map((r) => (
        <p key={r.name}>{r.name}</p>
      ))}
    </div>
  );
}

export default App;
