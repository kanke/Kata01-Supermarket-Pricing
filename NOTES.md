# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.

## Assumptions - For Test Purposes
- Buy one, get one free is mix and match across products....So if I buy digestive, I get milk for free
- The discount is not applied of cheapest one is free, it is based on order of scanning. In  ideal world, this will
not be the case
- Strategy pattern to select pricing strategy at run time, basket should be independent of how the strategy is implemented.
- Factory pattern to create pricing strategy on the fly because the implementation of an interface is expected to change 
frequently and the constructor only requires a handful of parameters
- Discount offers in an ideal world should read from database or file, therefore, shouldn't be hardcoded but in this test,
the buy one get one free is
- Such info such as Quantity, volume, minimum amount, discount value should be gotten from data source but hard coded for this test

![Imgur](https://imgur.com/GWW0Su4.png)


## To Do - For Test Purposes
- Include sequence diagram if there is time
- Include more unit test if there is time

## Questions To Think - For Test Purposes
- Discount should be applied on product level not item level?
- A product can have multiple discounts, which should we pick? 
- Multiple discounts on basket items, how should this be handled?
