# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.

## Assumptions - For Test Purposes
- Buy one, get one free is mix and match across product....So if I buy digestive, I get milk for free

## To Handle - For Test Purposes
- Discount should be applied on product level not item level?
- A product can have multiple discounts, which should we pick? 
- Discount is read from database or file, therefore, shouldn't be hardcoded.
- Multiple discounts on basket items, how should this be handled?
- Strategy pattern to select pricing strategy at run time, 
- Factory pattern to create pricing strategy on the fly because the implementation of an interface is expected to change frequently and the constructor only requires a handful of parameters