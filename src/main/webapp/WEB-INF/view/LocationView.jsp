<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>MMH Location</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
	<style>
	/* Set the size of the div element that contains the map */
	#map {
	  height: 400px;
	  /* The height is 400 pixels */
	  width: 100%;
	  /* The width is the width of the web page */
	}
	</style>
  </head>
  <body>
    <h3>Our Google Map Location</h3>
    <!--The div element for the map -->
    <div id="map"></div>

    <!-- 
     The `defer` attribute causes the callback to execute after the full HTML
     document has been parsed. For non-blocking uses, avoiding race conditions,
     and consistent behavior across browsers, consider loading using Promises
     with https://www.npmjs.com/package/@googlemaps/js-api-loader.
    -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDs2QBpjBdUkiDMdG25DQxuaGdxJHbSc84&callback=initMap&v=weekly"
      async
    >
    </script>
    <script>
	 // Initialize and add the map
	    function initMap() {
	      // The location of vanier
	      const mmh = { lat: 45.518, lng: -73.675 };
	      // The map, centered at Vanier
	      const map = new google.maps.Map(document.getElementById("map"), {
	        zoom: 6,
	        center: mmh,
	      });
	      // The marker, positioned at montreal
	      const marker = new google.maps.Marker({
	        position: mmh,
	        map: map,
	      });
	    }
    	window.initMap = initMap;
    </script>
    
  </body>
</html>