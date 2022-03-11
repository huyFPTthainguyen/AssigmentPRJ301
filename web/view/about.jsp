<%-- 
    Document   : about
    Created on : Feb 21, 2022, 10:38:34 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .about {
                width: 100%;
            }

            .about-club {
                width: 100%;
            }

            .about-club h1 {
                font-size: 40px;
                font-weight: bold;
                text-align: center;
                margin: 40px 0;
                color: #c70101;
                background-color: #f1f1f1;
                padding: 10px 0;
                text-transform: uppercase;
            }

            .about-club img {
                border-top: 1px solid #c70101;
                border-bottom: 1px solid #c70101;
            }

            .infor-club {
                width: 100%;
            }

            .infor-club h2 {
                font-size: 40px;
                font-weight: bold;
                text-align: center;
                margin: 40px 0;
                color: #c70101;
                background-color: #f1f1f1;
                padding: 10px 0;
                text-transform: uppercase;
            }

            .infor-club img {
                border: 1px solid #f1f1f1;

            }

            .infor-club p {
                font-size: 20px;
                color: #140a47;
            }

            .history-club {
                width: 100%;
            }

            .history-club h2 {
                font-size: 40px;
                font-weight: bold;
                text-align: center;
                margin: 40px 0;
                color: #c70101;
                background-color: #f1f1f1;
                padding: 10px 0;
                text-transform: uppercase;
            }

            .history-club h3 {
                font-size: 30px;
                font-weight: bold;
                color: #140a47;
                margin: 20px 0;
            }

            .history-club p {
                font-size: 20px;
                color: #140a47;
            }

            .stadium-club {
                width: 100%;
            }

            .stadium-club h2 {
                font-size: 40px;
                font-weight: bold;
                text-align: center;
                margin: 40px 0;
                color: #c70101;
                background-color: #f1f1f1;
                padding: 10px 0;
                text-transform: uppercase;
            }

            .stadium-club h3 {
                font-size: 30px;
                font-weight: bold;
                color: #140a47;
                margin: 20px 0;
            }

            .stadium-club p {
                font-size: 20px;
                color: #140a47;
            }
        </style>

        <title>JSP Page</title>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="about">
                <div class="about-club">
                    <h1>About the Club</h1>
                    <img src="https://wallpapercave.com/wp/wp3141768.jpg" alt="Wallpaper" width="100%" height="600px">
                </div>
                <div class="container">
                    <div class="infor-club">
                        <h2>Man United</h2>
                        <div class="row">
                            <div class="col-md-4">
                                <img src="https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/800px-Man_Utd_FC_.svg.png"
                                     alt="Logo" width="100%" height="300px">
                            </div>
                            <div class="col-md-8">
                                <p> Manchester United Football Club is a professional football club based in Old Trafford,
                                    Greater Manchester, England, that competes in the Premier League, the top flight of English
                                    football. Nicknamed "the Red Devils", the club was founded as Newton Heath LYR Football Club
                                    in 1878, but changed its name to Manchester United in 1902. The club moved from Newton Heath
                                    to its current stadium, Old Trafford, in 1910.
                                    <br> &ensp;Manchester United have won the most trophies in English club football, including
                                    a
                                    record 20 League titles, 12 FA Cups, five League Cups and a record 21 FA Community Shields.
                                    They have won the European Cup/UEFA Champions League three times, and the UEFA Europa
                                    League, the UEFA Cup Winners' Cup, the UEFA Super Cup, the Intercontinental Cup and the FIFA
                                    Club World Cup once each. In 1968, under the management of Matt Busby, 10 years after eight
                                    of the club's players were killed in the Munich air disaster, they became the first English
                                    club to win the European Cup. Alex Ferguson is the club's longest-serving and most
                                    successful manager, winning 38 trophies, including 13 league titles, 5 FA Cups and 2 UEFA
                                </p>
                            </div>
                            <p>
                                Champions League titles, between 1986 and 2013. In the 1998–99 season, under
                                Ferguson, the club became the first in the history of English football to achieve the
                                European treble of the Premier League, FA Cup and UEFA Champions League. In winning the
                                UEFA Europa League under José Mourinho in 2016–17, they also became one of five clubs to
                                have won the original three main UEFA club competitions (the Champions League, Europa League
                                and Cup Winners' Cup).</p>
                        </div>
                    </div>
                    <div class="history-club">
                        <h2>History of Club</h2>
                        <img src="https://img.bleacherreport.net/img/images/photos/001/664/371/ManchesterUnited1922_crop_north.jpg?1334901248&w=3072&h=2048"
                             alt="History" width="100%" height="400px">
                        <h3> Manchester United was formed in 1878 as Newton Heath LYR Football Club by the Carriage and Wagon
                            department of the Lancashire and Yorkshire Railway (LYR) depot at Newton Heath. The team
                            initially played games against other departments and railway companies, but on 20 November 1880,
                            they competed in their first recorded match; wearing the colours of the railway company – green
                            and gold – they were defeated 6–0 by Bolton Wanderers' reserve team.</h3>
                        <p> By 1888, the club had
                            become a founding member of The Combination, a regional football league. Following the league's
                            dissolution after only one season, Newton Heath joined the newly formed Football Alliance, which
                            ran for three seasons before being merged with The Football League. This resulted in the club
                            starting the 1892–93 season in the First Division, by which time it had become independent of
                            the railway company and dropped the "LYR" from its name. After two seasons, the club was
                            relegated to the Second Division.
                            In January 1902, with debts of £2,670 – equivalent to £300,000 in 2022 – the club was
                            served with a winding-up order. Captain Harry Stafford found four local businessmen,
                            including John Henry Davies (who became club president), each willing to invest £500 in return
                            for a direct interest in running the club and who subsequently changed the name; on 24 April
                            1902, Manchester United was officially born. Under Ernest Mangnall, who assumed
                            managerial duties in 1903, the team finished as Second Division runners-up in 1906 and secured
                            promotion to the First Division, which they won in 1908 – the club's first league title. The
                            following season began with victory in the first ever Charity Shield and ended with the
                            club's first FA Cup title. Manchester United won the First Division for the second time in 1911,
                            but at the end of the following season, Mangnall left the club to join Manchester City.</p>
                    </div>
                    <div class="stadium-club">
                        <h2>Stadium of Club</h2>
                        <img src="https://www.insidesport.in/wp-content/uploads/2021/12/Manchester-Uniteds-Stadium-Problem.jpg"
                             alt="History" width="100%" height="400px">
                        <h3> Newton Heath initially played at North Road near the tracks; The initial capacity was around
                            12,000, but management deemed such facilities insufficient for the club to join The Football
                            League. Expansion began in 1887 and in 1891 Newton Heath added two stands, each with a
                            capacity of 1,000 spectators. The highest recorded attendance for a match at North Road is
                            15,000 (meet Sunderland 4 March 1893). Audience numbers were similar when the team met
                            Gorton Villa on September 5, 1889. </h3>
                        <p> In June 1893, after the Manchester Deans and Canons, the owners of North Road, revoked the
                            right to use the pitch from Manchester United, secretary A. H. Albut obtained the right to
                            use Bank Street in Clayton.The stadium had no stands at first, but before the 1893–94 season
                            began two more stands were built; one stand covers the entire length of one side of the
                            field and the other stands at the back of the goal named "Bradford end". At the other end of
                            the goal named "Clayton end", gradually built. Newton Heath's first match at Bank Street was
                            against Burnley on September 1, 1893, in which 10,000 spectators watched Alf Farman's
                            hat-trick send Newton Heath to a 3–2 victory. The remaining stands were completed for the
                            match three weeks later against Nottingham Forest. In October 1895, before a visit to
                            Manchester City, the club purchased a 2,000-seat stand from rugby league club Broughton
                            Rangers. However, bad weather made the match against Manchester City only 12,000 people to
                            watch.</p>
                    </div>
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>
