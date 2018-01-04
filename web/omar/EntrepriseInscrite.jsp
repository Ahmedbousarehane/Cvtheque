<%@ page contentType="text/html;charset=iso-8859-1" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Nouvelles Entreprises Inscrites</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="files/nouvelles_entreprises/styles.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic" type="text/css" rel="stylesheet"/>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100italic,100,300,300italic,400italic,500,500italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/nouvelles_entreprises/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
    <script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function(){
        $('#myTable').dataTable();
        });
    </script>
  </head>
  <body>
    <div id="base" class="">

      <!-- Unnamed (Image) -->
      <div id="u153" class="ax_default image">
        <img id="u153_img" class="img " src="images/nouvelles_entreprises/u153.png"/>
        <!-- Unnamed () -->
        <div id="u154" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u155" class="ax_default image">
        <img id="u155_img" class="img " src="images/check_entreprise/u25.png"/>
        <!-- Unnamed () -->
        <div id="u156" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u157" class="ax_default heading_1">
        <div id="u157_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u158" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u159" class="ax_default shape">
        <div id="u159_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u160" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u161" class="ax_default">
        <img id="u161_img" class="img " src="images/check_entreprise/u6.png"/>
        <!-- Unnamed () -->
        <div id="u162" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Dynamic Panel) -->
      <div id="u163" class="ax_default">
        <div id="u163_state0" class="panel_state" data-label="State1" style="">
          <div id="u163_state0_content" class="panel_state_content">

            <!-- menu (Menu) -->
            <div id="u164" class="ax_default" data-label="menu">
              <img id="u164_menu" class="img " src="images/check_entreprise/menu_u9_menu.png" alt="u164_menu"/>

              <!-- Menu Vertical (Table) -->
              <div id="u165" class="ax_default" data-label="Menu Vertical">

                <!-- Unnamed (Menu Item) -->
                <div id="u166" class="ax_default">
                  <img id="u166_img" class="img " src="images/check_entreprise/u11.png"/>
                  <!-- Unnamed () -->
                  <div id="u167" class="text">
                    <p><a href="EntrepriseServlet?action=Lister"><span>Nouvelles Entrerpises Inscrites</span></a></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u168" class="ax_default">
                  <img id="u168_img" class="img " src="images/check_entreprise/u13.png"/>
                  <!-- Unnamed () -->
                  <div id="u169" class="text">
                    <p><span>Gérer le profil d'un EMiste</span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u170" class="ax_default">
                  <img id="u170_img" class="img " src="images/check_entreprise/u15.png"/>
                  <!-- Unnamed () -->
                  <div id="u171" class="text">
                    <p><span>Approuver un CV</span></p>
                  </div>
                </div>
              </div>

              <!-- Unnamed (Menu) -->
              <div id="u172" class="ax_default sub_menu">
                <img id="u172_menu" class="img " src="images/check_entreprise/u17_menu.png" alt="u172_menu"/>

                <!-- Unnamed (Table) -->
                <div id="u173" class="ax_default">

                  <!-- Unnamed (Menu Item) -->
                  <div id="u174" class="ax_default">
                      <a href="AjouterEMiste.jsp">
                    <img id="u174_img" class="img " src="images/check_entreprise/u19.png"/>
                    <!-- Unnamed () -->
                    <div id="u175" class="text">
                      <p><span>Ajouter un nouveau profil</span></p>
                    </div>
                      </a>
                  </div>

                  <!-- Unnamed (Menu Item) -->
                  <div id="u176" class="ax_default">
                      <a href="emisteview.jsp">
                    <img id="u176_img" class="img " src="images/check_entreprise/u21.png"/>
                    <!-- Unnamed () -->
                    <div id="u177" class="text">
                      <p><span>Modifier un profil existant</span></p>
                    </div>
                      </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- home (Shape) -->
      <div id="u178" class="ax_default icon" data-label="home">
          <a href="/Cvtheque/omar/AcceuilServlet">
        <img id="u178_img" class="img " src="images/check_entreprise/home_u23.png"/>
        <!-- Unnamed () -->
        <div id="u179" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
          </a>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u180" class="ax_default shape">
        <div id="u180_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u181" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u182" class="ax_default shape">
        <div id="u182_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u183" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u184" class="ax_default icon">
        <img id="u184_img" class="img " src="images/check_entreprise/u37.png"/>
        <!-- Unnamed () -->
        <div id="u185" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u186" class="ax_default image">
        <img id="u186_img" class="img " src="images/check_entreprise/u29.png"/>
        <!-- Unnamed () -->
        <div id="u187" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Text Field) -->
      <div id="u188" class="ax_default text_field">
        <input id="u188_input" type="text" value="Bonjour, ${sessionScope.id}"/>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u189" class="ax_default icon">
        <img id="u189_img" class="img " src="images/check_entreprise/u40.png"/>
        <!-- Unnamed () -->
        <div id="u190" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Table) -->
      <div id="u191" class="ax_default">
<table id="myTable" class="table table-striped" >
            <thead>
            <tr>
                <th>Nom de l'entreprise</th>
                <th>Domaine</th>
                <th>Téléphone</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${modele.listeentreprise}" var="entre">
                <tr>
                    <td><a href="EntrepriseServlet1?action=info&id=${entre.idEntr}" style="color:blue;">${entre.nom}</td>
                    <td>${entre.domaine}</td>
                    <td>${entre.tel}</td>
                </tr>
            </c:forEach>
</tbody>
                
            
</table>
      </div>

      <!-- Unnamed (Group) -->
      <div id="u204" class="ax_default" data-left="400" data-top="196" data-width="800" data-height="26">

        <!-- Unnamed (Group) -->
        <div id="u205" class="ax_default" data-left="400" data-top="196" data-width="800" data-height="26">

          <!-- Unnamed (Rectangle) -->
          <div id="u206" class="ax_default label">
            <div id="u206_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u207" class="text">
              <p><span>Bienvenue dans l'espace de gestion des nouvelles Entreprises inscrites</span></p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
