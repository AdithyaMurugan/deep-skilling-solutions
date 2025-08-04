import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

const EmployeeCard = ({ employee }) => {
  const theme = useContext(ThemeContext);

  return (
    <div className={`employee-card ${theme}`}>
      <h2>{employee.name}</h2>
      <p>{employee.role}</p>
      <button className={`theme-button ${theme}`}>View Details</button>
    </div>
  );
};

export default EmployeeCard;
