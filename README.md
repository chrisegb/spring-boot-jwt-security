# How to run this?
Start just running the Spring Boot application

Once it is running using postman prepare a POST request such that the body will be of type raw (JSON) then send the next:

```
{
    "username": "webclient",
    "password": "password"
}
```

You can see reference of this credentials inside the `FakeApplicationUserDaoService` class, there you can add the
credentials that you want, remember that this class is a fake dao, the normal thing will be to change this class with a
real dao, containing the credentials of all your clients into a DB.

The JWT token will appear inside the response Headers as `Authorization`

The rest is up to you.

Please also refer to this tutorial:

https://youtu.be/her_7pa0vrg?t=12835

I added also the exact and specific minute where the explanation of the JWT part, please give a thumb up to this repo, 
to my profile, follow me and please also thank to Amigoscode and to Nelson in the tutorial with a like and follow.

Please if you have any other specific question do not hesitate and ask.