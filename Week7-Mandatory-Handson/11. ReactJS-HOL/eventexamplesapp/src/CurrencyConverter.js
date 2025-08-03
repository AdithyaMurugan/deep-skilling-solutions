// CurrencyConverter.js
import React, { Component } from "react";

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: "",
      currency: "",
    };
  }

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value,
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    if (this.state.currency.toLowerCase() === "euro") {
      const converted = this.state.amount * 0.012; // assuming 1 rupee = 0.012 euro
      alert(`localhost:3000 says\nConverting to Euro amount is ${converted}`);
    } else {
      alert("Please enter a valid currency (Euro)");
    }
  };

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <div>
          Amount:{" "}
          <input type="text" name="amount" onChange={this.handleChange} />
          <br />
          <br />
          Currency:{" "}
          <input type="text" name="currency" onChange={this.handleChange} />
          <br />
          <br />
          <button type="submit">Submit</button>
        </div>
      </form>
    );
  }
}

export default CurrencyConverter;

