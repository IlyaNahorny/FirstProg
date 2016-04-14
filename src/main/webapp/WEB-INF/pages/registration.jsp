<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regirtration</title>
</head>
<body>
<div align="center">
    <h1>Join Now and enjoy</h1>
    <form action="/registration" method="post">

        <div>
            <label>First name</label>

            <div >
                <input name="firstName" type="text" placeholder="Enter first name"/>
            </div>
        </div>
        <div>
            <label>Last name</label>

            <div>
                <input name="lastName" type="text" placeholder="Enter last name"/>
            </div>
        </div>

        <div>
            <label>City</label>

            <div>
                <input name="city" type="text" placeholder="Enter your city"/>
            </div>
        </div>

        <div>
            <label>Age</label>

            <div>
                <input name="age" type="text" placeholder="Enter your age"/>
            </div>
        </div>

        <div>
            <label>User name</label>

            <div>
                <input name="username" type="text" placeholder="Enter username"/>
            </div>
        </div>
        <div>
            <label>Password</label>

            <div>
                <input name="password" type="password" placeholder="Enter password"/>
            </div>
        </div>


        <div>
            <div>
                <button type="submit">Sign Up</button>
            </div>
        </div>
    </form>
</div>


</body>
</html>
