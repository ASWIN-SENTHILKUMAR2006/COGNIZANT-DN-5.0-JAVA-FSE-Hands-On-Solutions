import React, { useState } from 'react';

function App() {
  const [counter, setCounter] = useState(1);
  const [amount, setAmount] = useState('80');
  const [currency, setCurrency] = useState('Euro');

  const sayHello = () => {
    alert('Hello! This is a static message.');
  };

  const handleIncrement = () => {
    setCounter((prev) => prev + 1);
    sayHello();
  };

  const handleDecrement = () => {
    setCounter((prev) => prev - 1);
  };

  const handleSayWelcome = (msg) => {
    alert(msg);
  };

  const handleClickMe = (e) => {
    alert('I was clicked');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const numericAmount = parseFloat(amount) || 0;
    const convertedAmount = numericAmount * 80;
    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <div style={{ fontSize: '18px', fontWeight: 'bold', marginBottom: '10px' }}>
        {counter}
      </div>

      <div style={{ display: 'flex', flexDirection: 'column', width: '120px', gap: '5px', marginBottom: '30px' }}>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
        <button onClick={() => handleSayWelcome('welcome')}>Say welcome</button>
        <button onClick={handleClickMe}>Click on me</button>
      </div>

      <h1 style={{ color: 'green', fontSize: '32px', marginBottom: '20px' }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit} style={{ display: 'inline-block' }}>
        <div style={{ marginBottom: '10px' }}>
          <label style={{ width: '80px', display: 'inline-block' }}>Amount:</label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>

        <div style={{ marginBottom: '15px' }}>
          <label style={{ width: '80px', display: 'inline-block' }}>Currency:</label>
          <textarea
            rows="2"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{ verticalAlign: 'top', resize: 'both' }}
          />
        </div>

        <div style={{ paddingLeft: '80px' }}>
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>
  );
}

export default App;