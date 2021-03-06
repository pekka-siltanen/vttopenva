// OpenVA - Open software platform for visual analytics
//
// Copyright (c) 2018, VTT Technical Research Centre of Finland Ltd
// All rights reserved.
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
//    1) Redistributions of source code must retain the above copyright
//       notice, this list of conditions and the following disclaimer.
//    2) Redistributions in binary form must reproduce the above copyright
//       notice, this list of conditions and the following disclaimer in the
//       documentation and/or other materials provided with the distribution.
//    3) Neither the name of the VTT Technical Research Centre of Finland nor the
//       names of its contributors may be used to endorse or promote products
//       derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS ``AS IS'' AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS AND CONTRIBUTORS BE LIABLE FOR ANY
// DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
// @author Pekka Siltanen

(function () {
	'use strict';

//	var counter = 0;
	
	angular.module('app')
	.controller('visualizationsController', ["$scope","$rootScope", "parameterService","metadataService","visualizationService","configurationService","analysisService","$uibModal", function ($scope, $rootScope,parameterService,metadataService,visualizationService,configurationService,analysisService, $uibModal) {
		   $scope.data = {
				    visualizations: [],
				    method: null,
				    title: null,
				    counter : 0,
		   };
		
			$scope.unitRequired = ['Scatterplot','Histogram','TimeSeriesNQuantOnePlotPerOi','TimeSeriesNominalBinary','TimeSeriesOneQuantOneLine','TimeSeriesOneQuantOneLinePerOi','TimeSeriesOneQuantOnePlotPerOi'];
		   
			$rootScope.setVisualizations = function(data) {
				$scope.data.visualizations = data;

			}

		
		$scope.visualizeWithParameters = function (ev) {
			$scope.data.method = this.node.method; 
			$scope.data.title = this.node.title;
			$scope.data.counter++;
			$uibModal.open({
				   templateUrl: "./templates/ui/visualizationselection/additionalInput.html",
				   controller: "additionalInputController",
				   scope: $scope,
				   backdrop: 'static',
				   size:'sm'
			});		
		};
		
		$scope.visualize = function (ev) {
			$scope.data.method = this.node.method; 
			$scope.data.title = this.node.title;
			$scope.data.counter++;
			parameterService.setVisualizationMethod($scope.data.method);
			parameterService.setVisualizationTitle($scope.data.title);
			visualizationService.add("visualization-"+ $scope.data.counter++);			
		};
		
		$scope.cancel = function () {
			analysisService.cancel();
		};	
		
	}]);
}());