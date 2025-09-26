<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Application</title>
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
<body>
<div class="form-container">
    <form action="saveRequest" method="post">
        <p>
            Name: <input type="text" name="name" placeholder="Enter your name">
        </p>
        <p>
            Email: <input type="email" name="email"  placeholder="Enter your email">
        </p>
        <p>
            Message: <input type="text" name="message" placeholder="Enter your message">
        </p>
        <p>
            <button type="submit">Sent</button>
        </p>
    </form>
</div>
</body>
</html>
