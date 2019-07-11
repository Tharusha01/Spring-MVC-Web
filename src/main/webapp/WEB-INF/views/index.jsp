<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <style>
        /* Assign grid instructions to our parent grid container */
        .grid-container {
            display: grid;
            grid-template-columns: 240px 1fr;
            grid-template-rows: 50px 1fr 50px;
            grid-template-areas:
                    "sidenav header"
                    "sidenav main"
                    "sidenav footer";
            height: 100vh;
        }

        /* Give every child element its grid name */
        .header {
            grid-area: header;
            background-color: #648ca6;
        }

        .sidenav {
            grid-area: sidenav;
            background-color: #394263;
        }

        .main {
            grid-area: main;
            background-color: #8fd4d9;
        }

        .footer {
            grid-area: footer;
            background-color: #648ca6;
        }
        .header, .footer {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 16px;
            background-color: #648ca6;
        }

        .sidenav {
            display: flex; /* Will be hidden on mobile */
            flex-direction: column;
            grid-area: sidenav;
            background-color: #394263;
        }
        .sidenav__list {
            padding: 0;
            margin-top: 85px;
            list-style-type: none;
        }
        .sidenav__list-item {
            padding: 20px 20px 20px 40px;
            color: #ddd;
        }
        .sidenav__list-item:hover {
            background-color: rgba(255, 255, 255, 0.2);
            cursor: pointer;
        }

        a:link, a:visited {
            background-color: #394262;
            color: white;
            padding: 14px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        a:hover, a:active {
            background-color: #394262;
            border-color: black;
        }

    </style>

</head>
<body>
    <h2 align="center">Today is <fmt:formatDate value="${today}" pattern="yyy-MM-dd" /></h2>
    <h2 align="center">Tutorials </h2>

    <!--Simple dashboard grid layout-->
        <div class="grid-container">
            <header class="header"></header>
            <aside class="sidenav">
                <ul class="sidenav__list">
                    <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/add">Add Tutorial</a></li>
                    <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/delete">Delete Tutorial</a></li>
                    <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/view">View Tutorials details</a></li>
                    <li class="sidenav__list-item"><a href="${pageContext.request.contextPath}/update">Update Tutorial Details</a></li>
                    <li class="sidenav__list-item"><a href="http://reactjs.org">React</a></li>
                </ul>
            </aside>
            <main class="main"></main>
            <footer class="footer">
                <div class="footer__copyright">&copy; 2019</div>
                <div class="footer__signature">THARUSHA WIJAYABAHU</div>
            </footer>
        </div>
</body>
</html>
