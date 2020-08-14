# AppDemoRepo

<B>Event : This is example of One to Many relationship</B><br/>
1-> this requirement will show <br/>
 what are the events running on a particular place <br/>
 for example  : place : bangelore<br/>
 		events: 1- dance event and also details <br/>
			2- education events also detailsetc<br/>
			
Store events:<br/>
API ENDPOINT : http://localhost:8080/event <br/>
<br/>input :<br/>
{	
	"eventPlace":"Bangalore",
	"event":[
			{
				"eventName":"Dance Event",
				"date":"2020-08-22",
				"eventDescription":"there are many dance events running in bangalore today"
			},
			{
				"eventName":"Education Event",
				"date":"2020-08-17",
				"eventDescription":"1- For java training go for some java training center,2-For python join Abc training center "
			}
		]
}
<br/>

2 : Find the events based on city:<br/>
API ENDPOINT  : http://localhost:8080/event/{eventPlace} <br/>
Example  : http://localhost:8080/event/delhi

3 : Find the events based on ID:<br/>
API ENDPOINT  :http://localhost:8080/event/id/{eVID} <br/>
Example  : http://localhost:8080/event/id/1
<br/>  
====================================================================<br/>

<b>MeetUp App Service Details</b><br/>
<b>MeetUp App is basically for register the user<b><br/>
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
        Example :       http://localhost:8080/meetup/delete/2

</br>=================================================================<br/>

4 : Fetch the user details by meetUpID<br/>
    A-> if user id will be in db return the user details.<br/>
    B-> if not then it will throw the exception<br/>	
    API ENDPOINT :  http://localhost:8080/meetup/meetUpID/{meetUpID}
<br/>Example : http://localhost:8080/meetup/meetUpID/1 


</br>=================================================================<br/>

5: Fetch the All user details :<br/>
   API ENDPOINT: http://localhost:8080/meetup/all

</br>=================================================================<br/>

6: Swagger implementation for Documentation<br/>
   API ENDPOINT : http://localhost:8080/swagger-ui.html





