# kodilla-jms-orders

Example of JMS - sending and receiving an ObjectMessage Order.

**Endpoint:**
http://localhost:8080/orders/process

**Sample RequestBody:**
{
    "client": {
        "firstName": "John",
        "lastName": "Smith"
    },
    "date": "23.08.2020",
    "status": "PLACED",
    "products":[
        {
                       "name":"apples",
                       "id":1,
                       "description":"green apples (kg)",
                       "amount": 5
                       },
            {
                       "name":"pears",
                       "id":2,
                       "description": "sweet pears (kg)",
                       "amount": 3
                  }        
   ]
}
