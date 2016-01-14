var myApp = angular.module("myModule", []);

var myController = function($scope) {
	var technologies = [
	                      { name: "C#", likes:0, dislikes:0},
	                      { name: "ASP.NET", likes:0, dislikes:0},
	                      { name: "SQL Server", likes:0, dislikes:0},
	                      { name: "AngularJS", likes:0, dislikes:0}
	                    ];
	
	$scope.technologies = technologies;
	
	$scope.incrementLikes = function(technology){
		technology.likes++;
	}

	$scope.incrementDislikes = function(technology){
		technology.dislikes++;
	}
	
	
	var employees = [
	                 {name: "Abc", dateOfBirth: new Date("March 1 1989"), gender: "Female", salary: 3000.788},
	                 {name: "Bcd", dateOfBirth: new Date("March 2 1989"), gender: "Male", salary: 3500.788},
	                 {name: "Def", dateOfBirth: new Date("March 4 1989"), gender: "Female", salary: 3800.788},
	                 {name: "Efg", dateOfBirth: new Date("March 5 1989"), gender: "Female", salary: 3600.788},
	                 {name: "Cde", dateOfBirth: new Date("March 3 1989"), gender: "Female", salary: 3040.788},
	                 ];
	
	$scope.employees = employees;
	
	$scope.rowLimit = 3;
	
	var employees2 = [
	                 {name: "Abc", dateOfBirth: new Date("March 1 1989"), gender: "Female", salary: 3000.788},
	                 {name: "Bcd", dateOfBirth: new Date("March 2 1989"), gender: "Male", salary: 3500.788},
	                 {name: "Def", dateOfBirth: new Date("March 4 1989"), gender: "Female", salary: 3800.788},
	                 {name: "Efg", dateOfBirth: new Date("March 5 1989"), gender: "Female", salary: 3600.788},
	                 {name: "Cde", dateOfBirth: new Date("March 3 1989"), gender: "Female", salary: 3040.788},
	                 ];
	
	$scope.employees2 = employees2;	
	$scope.reverseSort = false;
	$scope.sortColumn = 'name'; //default sorting by name
	
	$scope.sortData = function(column){
		$scope.reverseSort = ($scope.sortColumn==column)? !$scope.reverseSort: false;
		$scope.sortColumn = column;
	}
	
	$scope.getSortClass = function(column){
		if($scope.sortColumn==column){
			return $scope.reverseSort? 'arrow-down': 'arrow-up'
		}
		return '';
	}
	
	
	
	var employees3 = [
		                 {name: "Abc", dateOfBirth: new Date("March 1 1989"), gender: "Female", salary: 3000.788},
		                 {name: "Bcd", dateOfBirth: new Date("March 2 1989"), gender: "Male", salary: 3500.788},
		                 {name: "Def", dateOfBirth: new Date("March 4 1989"), gender: "Female", salary: 3800.788},
		                 {name: "Efg", dateOfBirth: new Date("March 5 1989"), gender: "Female", salary: 3600.788},
		                 {name: "Cde", dateOfBirth: new Date("March 3 1989"), gender: "Female", salary: 3040.788},
		                 ];
	
	$scope.employees3 = employees3;	
	
};

myApp.controller("myController", myController);