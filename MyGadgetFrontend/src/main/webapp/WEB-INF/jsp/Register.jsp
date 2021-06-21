<%@include file="CommonHeader.jsp"%>
<br/><br/><br/><br/><br/>

<form:form action="registerUser" modelAttribute="customer" method="post" align="center">
	
	<table align="center">
	<style>
	body, html{
     height: 100%;
     background-repeat: no-repeat;
 	background-color: #DEB887;
 	font-family: 'Oxygen', sans-serif;
    font-size: 12px;
}

.main{
 	margin-top: 70px;
}

h1.title { 
	font-size: 50px;
	font-family: 'Passion One', cursive; 
	font-weight: 400; 
}

hr{
	width: 10%;
	color: #000000;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 14px;
}

input,
input::-webkit-input-placeholder {
    font-size: 9px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}

.main-center{
 	margin-top: 30px;
 	margin: 0 auto;
 	max-width: 330px;
    padding: 40px 40px;

}
.login-button{
	margin-top: 3px;
}

.login-register{
	font-size: 8px;
	text-align: center;
}	
	</style>
	
		<div class="row">      
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="CustomerName">customer Name</label>
               <input name="CustomertName" class="form-control" type="text" align="center">    
           </div>            
      </div>
      <div class="row">      
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="UserName">userName</label>
               <input name="UsertName" class="form-control" type="text">    
           </div>            
      </div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="emailId">emailId</label>
               <input name="emailId" class="form-control" type="email">             
           </div>            
      </div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="contactNumber">contactnumber</label>
               <input name="contactNumber" class="form-control" type="contactNumber">             
           </div>            
      </div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="password">PASSWORD</label>
               <input name="password" class="form-control" type="password">             
           </div>            
      </div>
       <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="rpassword">rpassword</label>
               <input name="rpassword" class="form-control" type="password">             
           </div>            
      </div>
     <div class="form-group">
  <label class="col-md-4 control-label" for="gender">Gender</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="gender-0">
      <input type="radio" name="gender" id="gender-0" value="Male" checked="checked">
      Male
    </label> 
    <label class="radio-inline" for="gender-1">
      <input type="radio" name="gender" id="gender-1" value="Female">
      Female
    </label>
  </div>
</div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="role">role</label>
               <input name="role" class="form-control" type="role">             
           </div>            
      </div>
      <div class="form-group">
  <label class="col-md-4 control-label" for="address">Address</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="address" name="address">default text</textarea>
  </div>
</div>
      <hr>
      <div class="row">
           <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default regbutton">Register</button>
           
          </div>
          <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default logbutton">Sign up</button>           
          </div>          
      </div>    
    </form>
</div>
	</table>	
</form:form>
</body>
</html>