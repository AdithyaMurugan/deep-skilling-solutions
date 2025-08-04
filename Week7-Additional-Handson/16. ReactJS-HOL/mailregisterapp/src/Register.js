import React, { useState } from "react";

function Register() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length < 5) {
      alert("Full name must be 5 characters long!");
    } else if (!email.includes("@") || !email.includes(".")) {
      alert("Email is not valid");
    } else if (password.length < 8) {
      alert("Password must be at least 8 characters");
    } else {
      alert(`Registered Successfully!\nName: ${name}\nEmail: ${email}`);
      setName("");
      setEmail("");
      setPassword("");
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "200px" }}>
      <h2 style={{ color: "red" }}>Register Here!!!</h2>
      <form onSubmit={handleSubmit}>
        <table style={{ margin: "0 auto", textAlign: "left" }}>
          <tbody>
            <tr>
              <td>
                <label>Name:</label>
              </td>
              <td>
                <input
                  type="text"
                  value={name}
                  onChange={(e) => setName(e.target.value)}
                />
              </td>
            </tr>
            <tr>
              <td>
                <label>Email:</label>
              </td>
              <td>
                <input
                  type="text"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                />
              </td>
            </tr>
            <tr>
              <td>
                <label>Password:</label>
              </td>
              <td>
                <input
                  type="password"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                />
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <button type="submit">Submit</button>
              </td>
            </tr>
          </tbody>
        </table>
      </form>
    </div>
  );
}

export default Register;
