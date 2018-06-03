#CODE CHALLENGE

###VAGUE CODE CHALLENGE
We would like you to implement a simple application which works with two
REST APIs.
Suppose the user object only has three properties: id, name and role.
The first API allows the client to query a specific set of user objects by property
where the request may look like this.
GET /users/?role=foo
The response should look like this.
```
[
 {
 id: 2345,
 name: "java beans",
 role: "foo"
 },
 ...
]

```
The second API allows the client to create a user object with a request like this.
POST /users/
```
{
 name: "panda python",
 role: "bar"
}
```

This is an open-end code challenge. We would love to see your approach to
the problem.

The code maintainability is important.

Everything would run from Docker containers.

BONUS: Any log message must be non-blocking **(not implemented)**.

BONUS: Logs would be stored in a non-relational database **(not implemented)**.


##How to build
It requires that an installation of Java 8 development kit and docker.

```
./docker-build-image
./docker-run-image
```
The application will be running under port 8080.

