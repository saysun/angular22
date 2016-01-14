<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myModule">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Angular JS tutorial</title>
<script type="text/javascript" src="angularjs/angular.min.js"></script>
<script type="text/javascript" src="app/Script.js"></script>

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <link rel="stylesheet" href="css/style.css">
</head>
<body>

	
	<br>
	<div ng-Controller="myController">
		<table border ='1'>
			<thead>
			<tr>
				<th>Name</th>
				<th>Likes</th>
				<th>Dislikes</th>
				<th>Like/Dislike</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="technology in technologies">
					<td>{{technology.name}}</td>
					<td>{{technology.likes}}</td>
					<td>{{technology.dislikes}}</td>
					<td>
						<input type='button' value='Like' ng-click="incrementLikes(technology)">
						<input type='button' value='Dislike' ng-click="incrementDislikes(technology)">
					</td>
				</tr>
			</tbody>
		</table>
		
		<br/>
		<br/>
		
		
		Row to display <input type="number" step="1" min="0" max="5" ng-model="rowLimit"/>
		
		<table border = "1">
		<thead>
		<tr>
			<th>Name</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Salary(num)</th>
			<th>Salary(currency)</th>
		</tr>
		</thead>
		<tbody>
			<tr ng-repeat="employee in employees | limitTo:rowLimit">
				<td>{{employee.name}}</td>
				<td>{{employee.dateOfBirth |date:"dd/MM/yyyy"}}</td>
				<td>{{employee.gender | lowercase}}</td>
				<td>{{employee.salary |number: 2}}</td>
				<td>{{employee.salary | currency:"$":2 }}</td>
			</tr>
		
		</tbody>
		</table>
		
		
		
		<br/>
		<br/>
		Sorting
		<br/>
		<br/>
		<table border = "1">
		<thead>
		<tr>
			<th ng-click="sortData('name')">Name<div ng-class="getSortClass('name')"></div></th>
			<th ng-click="sortData('dateOfBirth')">DOB<div ng-class="getSortClass('dateOfBirth')"></th>
			<th ng-click="sortData('gender')">Gender<div ng-class="getSortClass('gender')"></th>
			<th ng-click="sortData('salary')">Salary(num)<div ng-class="getSortClass('salary')"></th>
		</tr>
		</thead>
		<tbody>
			<tr ng-repeat="employee in employees2 | orderBy: sortColumn:reverseSort ">
				<td>{{employee.name}}</td>
				<td>{{employee.dateOfBirth |date:"dd/MM/yyyy"}}</td>
				<td>{{employee.gender | lowercase}}</td>
				<td>{{employee.salary |number: 2}}</td>
			</tr>
		
		</tbody>
		</table>
		
		
		
		
		<br/>
		<br/>
		<div class="col-md-4">
		<div  class="col-md-6">
		<input type="text" placeholder="search employees" ng-model="searchText.name" class='form-control' style="margin:10px"> <!-- if want to have general, just searchText -->
		<input type="text" placeholder="search Gender" ng-model="searchText.gender" class='form-control' style="margin:10px"> 
		</div>
		<br/>
		<br/>
		
		<table class="table">
		<thead>
		<tr>
			<th>Name</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Salary(num)</th>
		</tr>
		</thead>
		<tbody>
			<tr ng-repeat="employee in employees3 | filter: searchText">
				<td>{{employee.name}}</td>
				<td>{{employee.dateOfBirth |date:"dd/MM/yyyy"}}</td>
				<td>{{employee.gender |lowercase}}</td>
				<td>{{employee.salary |number: 2}}</td>
			</tr>
		
		</tbody>
		</table>
		</div>
		<div class='col-md-8'></div>
		
	</div>
</body>
</html>