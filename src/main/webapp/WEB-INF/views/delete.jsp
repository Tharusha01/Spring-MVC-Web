<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <style>
        .container {
            margin: auto;
            display: grid;
            grid-template-columns: 100% auto;

        }
        .col {
            margin: auto;
            padding: .4em 2em;
        }
        .color-dark {
            background: rgba(0, 0, 0, 0.69);
            color: white;
        }


        input ,[type="number"],[type="date"],[type="text"] {
            border: 0;
            padding: 1em;
            width: 80%;
            margin-bottom: 2em;
        }
        input.btn {
            border: 0;
            font-weight: bold;
            display:block;
            padding:1em 3em;
            background:rgb(76, 0, 255);
            color:white;
            margin-bottom:1em;
            cursor:pointer;
            width: 84.5%;
        }
        button {
            border: 0;
            font-weight: bold;
            display:block;
            padding:1em 3em;
            background:rgb(76, 0, 255);
            color:white;
            margin-bottom:1em;
            cursor:pointer;
        }
        .pitemSyle{
            text-align: left;
            font-weight: bold;
            font-size: 14px;
        }
    </style>
</head>
<body>

    <div class="container color-dark">
        <div class="col">
            <h2 align = "center">Delete Tutorials</h2>
        </div>

    </div>


    <div class="container">

    <div class="col">
        <h3 align = "center">Tutorial</h3>
        <!--<p class = "pitemSyle">{{ dvdTotal }} DVD's {{messageDVD}}</p>-->
        <form action="deleteData" method="post">

            <input type="number" class="txt" name="tutId" placeholder="Enter Tutorial ID" required="Required">
            <input type="submit" class="btn" value="Delete a Tutorial" id = "btnDeleteTut">
        </form>

    </div>
</div>


</body>
</html>