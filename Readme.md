# Integracion de spring security con hibernate(daoProvider,userDetails...)
Para poder authenticarse se debera ingresar por ejemplo lo siguiente:
> Tener en cuenta que password=$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y
>  es el cifra de se guarda en la bd y spring security se encarga de la desencriptacion y encriptacion, en este caso el desencriptado es equivalente a password=123456

```sql
INSERT INTO users(username,password,enabled)
VALUES ('pepe','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', true);
INSERT INTO users(username,password,enabled)
VALUES ('niko','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', true);
/*user:mkyong password:123456;user:alex password:123456*/
INSERT INTO user_roles (username, role)
VALUES ('pepe', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('pepe', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('niko', 'ROLE_USER');
```