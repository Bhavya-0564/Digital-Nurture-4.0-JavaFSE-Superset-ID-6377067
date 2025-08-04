// src/components/BookDetails.js
import React from 'react';
import { books } from '../data/bookData';

function BookDetails() {
  return (
    <div className="s2">
      <h2>Book Details</h2>
      <ul>
        {books.map((book) => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>₹{book.price}</h4>
          </div>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
