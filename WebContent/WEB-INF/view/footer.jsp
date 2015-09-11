</div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>

        <script src="resources/js/jquery-1.11.1.min.js"></script>
        <script src="resources/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="resources/js/jquery-ui-1.10.3.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/modernizr.min.js"></script>
        <script src="resources/js/pace.min.js"></script>
        <script src="resources/js/retina.min.js"></script>
        <script src="resources/js/jquery.cookies.js"></script>
        
        <script src="resources/js/jquery.dataTables.min.js"></script>
        <script src="resources/cdn.datatables.net/plug-ins/725b2a2115b/integration/bootstrap/3/dataTables.bootstrap.js"></script>
        <script src="resources/cdn.datatables.net/responsive/1.0.1/js/dataTables.responsive.js"></script>
        <script src="resources/js/select2.min.js"></script>
        <script src="resources/js/jquery.validate.min.js"></script>

        <script src="resources/js/custom.js"></script>
        <script>
        jQuery(document).ready(function(){
            
            // Basic Form
            jQuery("#basicForm").validate({
                highlight: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                },
                success: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-error');
                }
            });
          
            // Error Message In One Container
            jQuery("#basicForm2").validate({
                errorLabelContainer: jQuery("#basicForm2 div.errorForm")
            });
          

             // Date Picker
            jQuery('#datepicker').datepicker(
            		{ startView: "year", 
            		    minViewMode: "months",
                		dateFormat: 'mm/yy/dd' }
                    );
            
            // Data Table
            jQuery('#basicTable').DataTable({
                    responsive: true
                });

            // With Checkboxes and Radio Buttons
            
            jQuery('#genderError').attr('for','gender');
            jQuery('#intError').attr('for','int[]');
            
            jQuery("#basicForm3").validate({
                highlight: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                },
                success: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-error');
                }
            });

         // Select2
            jQuery("#select-basic, #select-multi").select2();
            jQuery('#select-search-hide').select2({
                minimumResultsForSearch: -1
            });
            
            
            jQuery("#basicForm4").validate({
                highlight: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                },
                success: function(element) {
                    jQuery(element).closest('.form-group').removeClass('has-error');
                },
                ignore: null
            });
            
            // Validation with select boxes
            jQuery("#flowers, #fruits").select2({
                minimumResultsForSearch: -1
            });
            
          
        });
        </script>

    </body>


</html>
