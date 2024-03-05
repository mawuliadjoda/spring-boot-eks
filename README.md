# eksctl installation
https://eksctl.io/installation/
https://docs.aws.amazon.com/eks/latest/userguide/setting-up.html 


docker build -t springboot-eks .



Respectez les étapes suivantes pour authentifier et transférer une image à votre référentiel. Pour d'autres méthodes d'authentification de registre, dont l'assistant d'informations d'identification Amazon ECR, consultez Authentification de registre .
Récupérez un jeton d'authentification et authentifiez votre client Docker auprès de votre registre.
Utiliser l{AWSTOOL} :

    aws ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 533267226582.dkr.ecr.us-east-2.amazonaws.com
Remarque : si vous recevez une erreur en utilisant l{AWSTOOL}, assurez-vous que vous avez installé la dernière version de lAWS CLI et Docker.
Créez votre image Docker à l'aide de la commande suivante. Pour plus d'informations sur la création complète d'un fichier Docker, reportez-vous aux instructions ici . Si vous avez déjà créé l'image, ignorez cette étape :

    docker build -t springboot-eks .
Une fois que la création est terminée, balisez votre image pour pouvoir la transférer dans ce référentiel :

docker tag springboot-eks:latest 533267226582.dkr.ecr.us-east-2.amazonaws.com/springboot-eks:latest
Exécutez la commande suivante pour transférer cette image vers le référentiel AWS que vous avez créé :

    docker push 533267226582.dkr.ecr.us-east-2.amazonaws.com/springboot-eks:latest


# Create cluster
     
    eksctl create cluster --name adjodadev-cluster --version 1.28 --nodes=1 --node-type=t2.small --region us-east-2
    aws eks --region us-east-2 update-kubeconfig --name adjodadev-cluster

    D:\dev\java\kubernetes\spring-boot-eks> kubectl apply -f k8s.yaml
                                            kubectl get svc
                                            kubectl get pods
                                            eksctl delete cluster adjodadev-cluster
