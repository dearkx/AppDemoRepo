# AppDemoRepo

1 . Create new user :<br/>
 API ENDPOINT : http://localhost:8080/meetup/
<br/>input :
	
	{
	  "firstName": "kundan",
       "lastName": "Kumar",
       "email": "k@gmail.com",
       "username": "kundank",
       "password": "xyz"
	}

=================================================================<br/>

2 : Update user in database:<br/>
	A->Note: Here i am updating only firstName , lastName and password<br/>
	B->meetUpID must valid in table then only update will work<br/>

 API ENDPOINT : http://localhost:8080/meetup/update
 
</br>input :</br>
{	
  "meetUpID": 7,
  "firstName": "kk",
  "lastName": "test",
  "password": "kundan"
}
</br>=================================================================<br/>


3: Delete user in database:
   This Endpoint is used to delete the data from table using by meetUpID<br/> 
	A- > if user id will be in db it will delete that user record in db.<br/>
 	B-> if not then it will throw the exception<br/>
        API ENDPOINT :  http://localhost:8080/meetup/delete/{meetUpID}<br/>
   <br/>Example :       http://localhost:8080/meetup/delete/2<br/>

</br>=================================================================<br/>

4 : Fetch the user details by meetUpID<br/>
    A-> if user id will be in db return the user details.<br/>
    B-> if not then it will throw the exception<br/>	
    API ENDPOINT :  http://localhost:8080/meetup/meetUpID/1


</br>=================================================================<br/>

5: Fetch the All user details :<br/>
   API ENDPOINT: http://localhost:8080/meetup/all

</br>=================================================================<br/>

6: Swagger implementation for Documentation<br/>
   API ENDPOINT : http://localhost:8080/swagger-ui.html





