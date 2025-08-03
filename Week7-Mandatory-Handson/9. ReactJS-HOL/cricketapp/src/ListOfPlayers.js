
import React from "react";

function ListOfPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => (
        <div key={index}>
          <li>
            Mr. {item.name} <span>({item.score})</span>
          </li>
        </div>
      ))}
    </div>
  );
}

export default ListOfPlayers;
