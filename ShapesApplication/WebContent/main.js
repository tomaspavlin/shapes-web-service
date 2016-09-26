'use strict';

$(document).ready(function(){
	var lengths = ["Angstroms", "Nanometers", "Microinch", "Microns", "Mils", 
	               "Millimeters", "Centimeters", "Inches", "Links", "Spans", "Feet",
	               "Cubits", "Varas", "Yards", "Meters", "Fathoms", "Rods",
	               "Chains", "Furlongs", "Cablelengths", "Kilometers", "Miles",
	               "Nauticalmile", "League", "Nauticalleague"];
	var areas = ["acre", "acrecommercial", "acreIreland", "acresurvey", "are",
	             "baseboxtinplatedsteel", "binTaiwan", "buJapan", "canteroEcuador",
	             "caoVietnam", "centaire", "circularfootinternational",
	             "circularfootUSsurvey", "circularinchinternational", "circularinchUSsurvey",
	             "hectare", "laborCanada", "laborUSsurvey", "manzanaCostaRican",
	             "manzanaArgentina", "rood", "saoVietnam", "scrupleancientRome",
	             "sectionUSsurvey", "square", "squareSriLanka", "squareangstrom",
	             "squareastronomicalunit", "squarecablelengthUSsurvey",
	             "squarecaliber", "squarecentimeter", "squarechainGunterUSsurvey",
	             "squarechainRamdenEngineer", "squarecubit", "squarecubitancientEgypt",
	             "squaredigit", "squarefathom", "squarefootinternational",
	             "squarefootUSsurvey", "squarefurlongUSsurvey", "squaregigameter",
	             "squarehectometer", "squareinchinternational", "squareinchUSsurvey",
	             "squarekilometer", "squareleaguenautical", "squareleagueUSstatute",
	             "squarelightyear", "squarelinkGunterUSsurvey", "squarelinkRamdenEngineer",
	             "squaremegameter", "squaremeter", "squaremicroinch", "squaremicrometer",
	             "squaremicromicron", "squaremicron", "squaremil", "squaremileinternational",
	             "squaremileintnautical", "squaremileUSnautical", "squaremileUSstatute",
	             "squaremileUSsurvey", "squaremillimeter", "squaremillimicron",
	             "squarenanometer", "squareParisfootCanada", "squareparsec",
	             "squareperchIreland", "squareperchUSsurvey", "squarepetameter",
	             "squarepicometer", "squarerodNetherlands", "squaretenthmeter",
	             "squareyardUSsurvey", "squareyardinternational", "squareyoctometer",
	             "squareyottameter", "squarezeptometer", "squarezettameter", "townshipUSsurvey"];
	
	var triangleBaseUnit = $("#triangleForm select[name=baseUnit]");
	var triangleHeightUnit = $("#triangleForm select[name=heightUnit]");
	var triangleResultUnit = $("#triangleForm select[name=resultUnit]");
	
	var squareSideUnit = $("#squareForm select[name=sideUnit]");
	var squareResultUnit = $("#squareForm select[name=resultUnit]");
	
	var circleRadiusUnit = $("#circleForm select[name=radiusUnit]");
	var circleResultUnit = $("#circleForm select[name=resultUnit]");
	
	lengths.forEach(function (name) {
		triangleBaseUnit.append($('<option value="' + name + '">' + name + '</option>'));
		triangleHeightUnit.append($('<option value="' + name + '">' + name + '</option>'));
		squareSideUnit.append($('<option value="' + name + '">' + name + '</option>'));
		circleRadiusUnit.append($('<option value="' + name + '">' + name + '</option>'));
	});
	
	areas.forEach(function (name) {
		triangleResultUnit.append($('<option value="' + name + '">' + name + '</option>'));
		squareResultUnit.append($('<option value="' + name + '">' + name + '</option>'));
		circleResultUnit.append($('<option value="' + name + '">' + name + '</option>'));
	});
	
	var triangleResult = $('#triangleResult');
	var triangleError = $('#triangleError');
	
	var squareResult = $('#squareResult');
	var squareError = $('#squareError');
	
	var circleResult = $('#circleResult');
	var circleError = $('#circleError');
	
	$("#triangleForm").submit(function(e) {
		$.ajax({
			type: "GET",
			url: "/ComputeTriangleAreaByBaseAndHeight",
			data: $("#triangleForm").serialize(),
			success: function(data) {
				var output = "The area is = " + data;
				console.log(output);
				triangleResult.removeClass('hidden');
				triangleError.addClass('hidden');
				$("#triangleResult").text(output);
			},
			error: function(e) {
				triangleResult.addClass('hidden');
				triangleError.removeClass('hidden');
			}
		});
		e.preventDefault();
	});
	
	$("#squareForm").submit(function(e) {
		$.ajax({
			type: "GET",
			url: "/ComputeSquareArea",
			data: $("#squareForm").serialize(),
			success: function(data) {
				var output = "The area is = " + data;
				console.log(output);
				squareResult.removeClass('hidden');
				squareError.addClass('hidden');
				$("#squareResult").text(output);
			},
			error: function(e) {
				squareResult.addClass('hidden');
				squareError.removeClass('hidden');
			}
		});
		e.preventDefault();
	});
	
	$("#circleForm").submit(function(e) {
		$.ajax({
			type: "GET",
			url: "/ComputeCircleArea",
			data: $("#circleForm").serialize(),
			success: function(data) {
				var output = "The area is = " + data;
				console.log(output);
				circleResult.removeClass('hidden');
				circleError.addClass('hidden');
				$("#circleResult").text(output);
			},
			error: function(e) {
				circleResult.addClass('hidden');
				circleError.removeClass('hidden');
			}
		});
		e.preventDefault();
	});
});