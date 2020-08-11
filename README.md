# AppDemoRepo

1 . create new user : 
http://localhost:8080/meetup/

input :
	
	{
	  "firstName": "kundan",
       "lastName": "Kumar",
       "email": "k@gmail.com",
       "username": "kundank",
       "password": "xyz"
	}



2 : update user in database:
Note: Here i am updating only firstName , lastName and password
	-> meetUpID must valid in table then only update will work

http://localhost:8080/meetup/update

input :

{	
  "meetUpID": 7,
  "firstName": "kk",
  "lastName": "test",
  "password": "kundan"

}



3: delete user in database:

 This Endpoint is used to delete the data from table using by meetUpID 
 A- > if user id will be in db it will delete that user record in db.
 B-> if not then it will throw the exception	
 
 API : http://localhost:8080/meetup/delete/2




4 : Fetch the user details by meetUpID
 A- > if user id will be in db return the user details.
 B-> if not then it will throw the exception	
http://localhost:8080/meetup/meetUpID/1




5: Fetch the All user details :
http://localhost:8080/meetup/all


6: Swagger implementation for Documentation<br/>
http://localhost:8080/swagger-ui.html





