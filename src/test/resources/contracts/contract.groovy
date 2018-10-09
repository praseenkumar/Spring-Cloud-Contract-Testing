import org.springframework.cloud.contract.spec.Contract

 Contract.make {

        request {
                method ('GET')
                url ('/empData'){
                
               		queryParameters {
               		 parameter 'id':$(consumer(regex('[0-9]{3}')),producer('123'))
               		}
                }
                }
                
         response {
                status 200

          body ([
          
                 "employeeId" : $(regex("[0-9]{8}")),
               
                 "name" : $(regex("[a-zA-Z. ]+")),
               
                 "dateofBirth": $(regex("[0-9]{9}")),
               
                 "workLocation": $(regex("[a-zA-Z. ]+")),
               
                 "band": $(regex("[0-9A-Z]{2}")),
               
                 "desination": $(regex("[a-zA-Z ]+")),
               
                 "relianceEmail": $(regex("[A-Z.@]+")),
               
                 "mobileNo": $(regex("[0-9]{10}")),
               
                 "residenceNo": $(regex("[0-9-]+")),
               
                 "posFromTop": $(regex('[0-9]{1}')),
               
                 "managerId": $(regex("[0-9]{8}")),
               
                 "managerName": $(regex("[a-zA-Z. ]+"))
               
                
               
             ])
             
             
                headers{
                
                contentType applicationJson()
                
                }
                
      		}                    
 }                   