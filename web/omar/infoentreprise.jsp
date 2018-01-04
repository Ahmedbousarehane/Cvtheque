<%@ page contentType="text/html;charset=iso-8859-1" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Informations sur l'entreprise</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="files/info_entreprise/styles.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic" type="text/css" rel="stylesheet"/>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Roboto:400,100italic,100,300,300italic,400italic,500,500italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <link href="http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic" type="text/css" rel="stylesheet"/>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/prototypePre.js"></script>
    <script src="data/document.js"></script>
    <script src="resources/scripts/prototypePost.js"></script>
    <script src="files/info_entreprise/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
    <script type="text/javascript">
            function confirmer(url){
                var rep=confirm("Etes-vous sûr de vouloir supprimer la demande de cette entreprise ?");
                if (rep==true){
                    document.location=url;
                }
            }
        </script>
  </head>
  <body>
    <div id="base" class="">

      <!-- Unnamed (Image) -->
      <div id="u84" class="ax_default image">
        <img id="u84_img" class="img " src="images/check_entreprise/u0.png"/>
        <!-- Unnamed () -->
        <div id="u85" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u86" class="ax_default heading_1">
        <div id="u86_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u87" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u88" class="ax_default shape">
        <div id="u88_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u89" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u90" class="ax_default">
        <img id="u90_img" class="img " src="images/check_entreprise/u6.png"/>
        <!-- Unnamed () -->
        <div id="u91" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Dynamic Panel) -->
      <div id="u92" class="ax_default">
        <div id="u92_state0" class="panel_state" data-label="State1" style="">
          <div id="u92_state0_content" class="panel_state_content">

            <!-- menu (Menu) -->
            <div id="u93" class="ax_default" data-label="menu">
              <img id="u93_menu" class="img " src="images/check_entreprise/menu_u9_menu.png" alt="u93_menu"/>

              <!-- Menu Vertical (Table) -->
              <div id="u94" class="ax_default" data-label="Menu Vertical">

                <!-- Unnamed (Menu Item) -->
                <div id="u95" class="ax_default">
                  <img id="u95_img" class="img " src="images/check_entreprise/u11.png"/>
                  <!-- Unnamed () -->
                  <div id="u96" class="text">
                    <p><a href="EntrepriseServlet?action=Lister"><span>Nouvelles Entrerpises Inscrites</span></a></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u97" class="ax_default">
                  <img id="u97_img" class="img " src="images/check_entreprise/u13.png"/>
                  <!-- Unnamed () -->
                  <div id="u98" class="text">
                    <p><span>Gérer le profil d'un EMiste</span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u99" class="ax_default">
                  <img id="u99_img" class="img " src="images/check_entreprise/u15.png"/>
                  <!-- Unnamed () -->
                  <div id="u100" class="text">
                    <p><span>Approuver un CV</span></p>
                  </div>
                </div>
              </div>

              <!-- Unnamed (Menu) -->
              <div id="u101" class="ax_default sub_menu">
                <img id="u101_menu" class="img " src="images/check_entreprise/u17_menu.png" alt="u101_menu"/>

                <!-- Unnamed (Table) -->
                <div id="u102" class="ax_default">

                  <!-- Unnamed (Menu Item) -->
                  <div id="u103" class="ax_default">
                      <a href="AjouterEMiste.jsp">
                    <img id="u103_img" class="img " src="images/check_entreprise/u19.png"/>
                    <!-- Unnamed () -->
                    <div id="u104" class="text">
                      <p><span>Ajouter un nouveau profil</span></p>
                    </div>
                      </a>
                  </div>

                  <!-- Unnamed (Menu Item) -->
                  <div id="u105" class="ax_default">
                      <a href="emisteview.jsp">
                    <img id="u105_img" class="img " src="images/check_entreprise/u21.png"/>
                    <!-- Unnamed () -->
                    <div id="u106" class="text">
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
      <div id="u107" class="ax_default icon" data-label="home">
          <a href="/Cvtheque/omar/AcceuilServlet">
        <img id="u107_img" class="img " src="images/check_entreprise/home_u23.png"/>
        <!-- Unnamed () -->
        <div id="u108" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
          </a>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u109" class="ax_default image">
        <img id="u109_img" class="img " src="images/check_entreprise/u25.png"/>
        <!-- Unnamed () -->
        <div id="u110" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u111" class="ax_default shape">
        <div id="u111_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u112" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Image) -->
      <div id="u113" class="ax_default image">
        <img id="u113_img" class="img " src="images/check_entreprise/u29.png"/>
        <!-- Unnamed () -->
        <div id="u114" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Group) -->
      <div id="u115" class="ax_default" data-left="196" data-top="193" data-width="1093" data-height="461">

        <!-- Unnamed (Rectangle) -->
        <div id="u116" class="ax_default box_1">
          <div id="u116_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u117" class="text" style="display:none; visibility: hidden">
            <p><span></span></p>
          </div>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u118" class="ax_default heading_1">
        <div id="u118_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u119" class="text">
          <p><span style="text-decoration:underline;">Adresse :</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u120" class="ax_default label">
        <div id="u120_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u121" class="text">
          <p><span>${modele.entreprise.adresse}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u122" class="ax_default heading_1">
        <div id="u122_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u123" class="text">
          <p><span style="text-decoration:underline;">Téléphone :</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u124" class="ax_default heading_1">
        <div id="u124_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u125" class="text">
          <p><span style="text-decoration:underline;">Domaine :</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u126" class="ax_default label">
        <div id="u126_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u127" class="text">
          <p><span>${modele.entreprise.tel}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u128" class="ax_default label">
        <div id="u128_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u129" class="text">
          <p><span>${modele.entreprise.mail}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u130" class="ax_default paragraph">
        <div id="u130_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u131" class="text">
          <p><span>${modele.entreprise.description}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u132" class="ax_default heading_1">
        <div id="u132_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u133" class="text">
          <p><span style="text-decoration:underline;">Description :</span></p>
        </div>
      </div>

      <!-- CHECK (Shape) -->
      <div id="u134" class="ax_default icon" data-label="CHECK">
      <a href="EntrepriseServlet1?action=ajouter&id=${modele.entreprise.idEntr}" >
        <img id="u134_img" class="img " src="images/info_entreprise/check_u134.png"/>
        <!-- Unnamed () -->
        <div id="u135" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
        </a>
      </div>

      <!-- CROSS (Shape) -->
      <div id="u136" class="ax_default icon" data-label="CROSS">
      <a href="javascript:confirmer('EntrepriseServlet1?action=delete&id=${modele.entreprise.idEntr}')">
        <img id="u136_img" class="img " src="images/info_entreprise/cross_u136.png"/>
        <!-- Unnamed () -->
        <div id="u137" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
        </a>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u138" class="ax_default heading_1">
        <div id="u138_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u139" class="text">
          <p><span style="text-decoration:underline;">Email :</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u140" class="ax_default label">
        <div id="u140_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u141" class="text">
          <p><span>Vous êtes sur le profil de&nbsp; l'entreprise :</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u142" class="ax_default label">
        <div id="u142_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u143" class="text">
          <p><span>${modele.entreprise.nom}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u144" class="ax_default label">
        <div id="u144_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u145" class="text">
          <p><span>${modele.entreprise.domaine}</span></p>
        </div>
      </div>

      <!-- Unnamed (Rectangle) -->
      <div id="u146" class="ax_default shape">
        <div id="u146_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u147" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u148" class="ax_default icon">
        <img id="u148_img" class="img " src="images/check_entreprise/u37.png"/>
        <!-- Unnamed () -->
        <div id="u149" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (Text Field) -->
      <div id="u150" class="ax_default text_field">
        <input id="u150_input" type="text" value="Bonjour, ${sessionScope.id}"/>
      </div>

      <!-- Unnamed (Shape) -->
      <div id="u151" class="ax_default icon">
        <img id="u151_img" class="img " src="images/check_entreprise/u40.png"/>
        <!-- Unnamed () -->
        <div id="u152" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>
    </div>
  </body>
</html>
