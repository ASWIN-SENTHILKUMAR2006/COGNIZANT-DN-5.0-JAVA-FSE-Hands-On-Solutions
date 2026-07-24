import React from 'react';

function BookDetails(props) {
  return (
    <div style={{ flex: 1, padding: '0 20px', borderRight: '5px solid green', textAlign: 'center' }}>
      <h2>Book Details</h2>
      <div>
        {props.books.map((book) => (
          <div key={book.id} style={{ marginBottom: '20px' }}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}
      </div>
    </div>
  );
}

export default BookDetails;