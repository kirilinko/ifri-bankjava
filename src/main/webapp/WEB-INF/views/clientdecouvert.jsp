<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

    <head>
		<title>Cients avec compte à découvert</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" />
	</head>
	
	<body style="font-family:Montserrat!important">
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-4">
	 <div class="container text-end mb-2 ">
       <span class="navbar-brand"><i class="fa fa-university" aria-hidden="true"></i> Bank-TP Spring Boot</span>
       <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarText">
         <ul class="navbar-nav mr-auto">
           <li class="nav-item">
             <a class="nav-link font-weight-bold text-secondary" href="/client/list"> <i class="fa fa-users" aria-hidden="true"></i> Liste des clients </a>
          </li>
         <li class="nav-item">
           <a class="nav-link font-weight-bold text-white" href="/compte/client/decouvert"><i class="fa fa-exclamation-triangle" aria-hidden="true"></i> Clients à découvert</a>
         </li>
         <li class="nav-item active">
           <a class="nav-link font-weight-bold text-secondary" href="/client/agence"><i class="fa fa-building" aria-hidden="true"></i> Client par Agence</a>
         </li>
         <li class="nav-item">
           <a class="nav-link font-weight-bold text-secondary" href="#"><i class="fa fa-plus" aria-hidden="true"></i> Ajouter Client</a>
         </li>
       </ul>
     </div>
   </div>
  </nav>
  
  <div class="container">
       
       <h4 class="text mb-4">Liste des clients avec compte à découvert</h4>
       
        <c:url var="search_client_url" value="/compte/client/decouvert"/>
       <form:form action="${search_client_url}" method="get" class="form-inline">
         <div class="row">
           
             <div class="col-sm mx-sm-3 mb-2">
                 <label class="sr-only">Banque</label>
                 <select name="banqueid" class="form-control">   
                    <option value="0">Choisir une Banque</options>
                 <c:forEach  items="${banques}" var="banque">
					<option value="${banque.numerobank}">${banque.nombanque}</option>
				  </c:forEach>  
                </select>
             </div>
             <div class="col-sm mt-4">
                <button type="submit" class="btn btn-primary ">Rechercher </button>
             </div>
        </div>     
      </form:form>
      
      <table class="table">
           <thead class="thead-dark">
             <tr>
                 <th scope="col">N°Compte</th>
                 <th scope="col">Nom</th>
                 <th scope="col">Prenom</th>
                 <th scope="col">Solde</th>
                 <th scope="col">Banque</th>
                 
            </tr>
           </thead>
           <tbody>
            <c:forEach items="${comptes}" var="compte">
              <tr>
                <th>${compte.numerocompte}</th>
                <th>${compte.client.nom}</th>
                <td>${compte.client.prenom}</td>
                <td>${compte.solde}</td>
                <td>${compte.client.agence.bank.nombanque}</td> 
              </tr>
            </c:forEach> 
          </tbody>
      </table>
  
  
  
  </div>    
     	      
              
 </body>
</html>
