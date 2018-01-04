<%@ page contentType="text/html;charset=iso-8859-1" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Liste des EMIstes</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="files/liste_emistes/styles.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic" type="text/css" rel="stylesheet"/>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100italic,100,300,300italic,400italic,500,500italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/liste_emistes/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <script type="text/javascript">
            function confirmer(url){
                var rep=confirm("Etes-vous sûr de vouloir supprimer ?");
                if (rep==true){
                    document.location=url;
                }
            }
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
      <div id="u449" class="ax_default image">
        <img id="u449_img" class="img " src="images/nouvelles_entreprises/u153.png"/>
        <!-- Unnamed () -->
        <div id="u450" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u451" class="ax_default image">
        <img id="u451_img" class="img " src="images/check_entreprise/u25.png"/>
        <!-- Unnamed () -->
        <div id="u452" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u453" class="ax_default heading_1">
        <div id="u453_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u454" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u455" class="ax_default shape">
        <div id="u455_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u456" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u457" class="ax_default">
        <img id="u457_img" class="img " src="images/check_entreprise/u6.png"/>
        <!-- Unnamed () -->
        <div id="u458" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Dynamic Panel) -->
      <div id="u459" class="ax_default">
        <div id="u459_state0" class="panel_state" data-label="State1" style="">
          <div id="u459_state0_content" class="panel_state_content">

            <!-- menu (Menu) -->
            <div id="u460" class="ax_default" data-label="menu">
              <img id="u460_menu" class="img " src="images/check_entreprise/menu_u9_menu.png" alt="u460_menu"/>

              <!-- Menu Vertical (Table) -->
              <div id="u461" class="ax_default" data-label="Menu Vertical">

                <!-- Unnamed (Menu Item) -->
                <div id="u462" class="ax_default">
                  <img id="u462_img" class="img " src="images/check_entreprise/u11.png"/>
                  <!-- Unnamed () -->
                  <div id="u463" class="text">
                    <p><a href="EntrepriseServlet?action=Lister"><span>Nouvelles Entrerpises Inscrites</span></a></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u464" class="ax_default">
                  <img id="u464_img" class="img " src="images/check_entreprise/u13.png"/>
                  <!-- Unnamed () -->
                  <div id="u465" class="text">
                    <p><span>Gérer le profil d'un EMiste</span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u466" class="ax_default">
                  <img id="u466_img" class="img " src="images/check_entreprise/u15.png"/>
                  <!-- Unnamed () -->
                  <div id="u467" class="text">
                    <p><span>Approuver un CV</span></p>
                  </div>
                </div>
              </div>

              <!-- Unnamed (Menu) -->
              <div id="u468" class="ax_default sub_menu">
                <img id="u468_menu" class="img " src="images/check_entreprise/u17_menu.png" alt="u468_menu"/>

                <!-- Unnamed (Table) -->
                <div id="u469" class="ax_default">

                  <!-- Unnamed (Menu Item) -->
                  <div id="u470" class="ax_default">
                      <a href="AjouterEMiste.jsp">
                    <img id="u470_img" class="img " src="images/check_entreprise/u19.png"/>
                    <!-- Unnamed () -->
                    <div id="u471" class="text">
                      <p><span>Ajouter un nouveau profil</span></p>
                    </div>
                      </a>
                  </div>

                  <!-- Unnamed (Menu Item) -->
                  <div id="u472" class="ax_default">
                      <a href="emisteview.jsp">
                    <img id="u472_img" class="img " src="images/check_entreprise/u21.png"/>
                    <!-- Unnamed () -->
                    <div id="u473" class="text">
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
      <div id="u474" class="ax_default icon" data-label="home">
          <a href="/Cvtheque/omar/AcceuilServlet">
        <img id="u474_img" class="img " src="images/check_entreprise/home_u23.png"/>
        <!-- Unnamed () -->
        <div id="u475" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
          </a>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u476" class="ax_default shape">
        <div id="u476_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u477" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u478" class="ax_default shape">
        <div id="u478_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u479" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u480" class="ax_default icon">
        <img id="u480_img" class="img " src="images/check_entreprise/u37.png"/>
        <!-- Unnamed () -->
        <div id="u481" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u482" class="ax_default image">
        <img id="u482_img" class="img " src="images/check_entreprise/u29.png"/>
        <!-- Unnamed () -->
        <div id="u483" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u484" class="ax_default icon">
        <img id="u484_img" class="img " src="images/check_entreprise/u40.png"/>
        <!-- Unnamed () -->
        <div id="u485" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Text Field) -->
      <div id="u486" class="ax_default text_field">
        <input id="u486_input" type="text" value="Bonjour, ${sessionScope.id}"/>
      </div>
<form action="ControleurServlet" method="post" accept-charset="iso-8859-1">
      <!-- Unnamed (Table) -->
      <div id="u487" class="ax_default">
<table id="myTable" class="table table-striped">
            <thead>
            <tr>
                <th>Matricule</th>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Génie</th>
                <th>Promotion</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${modele.listeemiste}" var="e">
                <tr>
                    <td><a href="ControleurServlet?action=info&matricule=${e.matricule}" style="color:blue;">${e.matricule}</td>
                    <td>${e.nom}</td>
                    <td>${e.prenom}</td>
                    <td>${e.genie}</td>
                    <td>${e.promotion}</td>
                    <td><a href="ControleurServlet?action=edit&matricule=${e.matricule}" style="color:#009900;">Modifier</a>&nbsp; <span style="color:#000000;">|&nbsp;</span><a href="javascript:confirmer('ControleurServlet?action=delete&matricule=${e.matricule}')" style="color:#FF0000;">Supprimer</a></td>

                </tr>
                    </c:forEach>
            </tbody>
</table>
      </div>

      <!-- Unnamed (Group) -->
      <div id="u500" class="ax_default" data-left="400" data-top="196" data-width="800" data-height="11">

        <!-- Unnamed (Group) -->
        <div id="u501" class="ax_default" data-left="400" data-top="196" data-width="800" data-height="11">

          <!-- Unnamed (Rectangle) -->
          <div id="u502" class="ax_default label">
            <div id="u502_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u503" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>
        </div>
      </div>

      <!-- Unnamed (Text Field) -->
      <div id="u504" class="ax_default text_field">
        <input id="u504_input" type="text" name="nom" placeholder="         Entrer le ou le début du nom de l'EMIste"  />
      </div>

      <!-- Unnamed (HTML Button) -->
      <div id="u505" class="ax_default html_button">
        <input id="u505_input" type="submit" name="action" value="chercher"/>
      </div>
    </div>
  </body>
</html>
