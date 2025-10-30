window.onload = function () { 
                 var inputs = document.getElementsByTagName ("input"); 
                for (let i=0; i<inputs.length; i++) { 
                    if (inputs[i].type == "text" || inputs[i].type == "password") { 
                        inputs[i].onfocus = resalta; 
                        inputs[i].onblur = noresalta; 
                    } 
                } 
            } 
            function resalta() { 
                this.style.backgroundColor = "khaki"; 
                this.style.color = "red"; 
            } 
            function noresalta() { 
                this.style.backgroundColor = "white"; 
                this.style.color = "black"; 
            } 