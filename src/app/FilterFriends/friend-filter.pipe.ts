import { Pipe, PipeTransform } from '@angular/core'
import { Friend } from '../Friends/friend'
@Pipe({
  name: 'friendFilter',
})
export class FriendFilterPipe implements PipeTransform {
  transform(value: Friend[], companyName: string, collegeName: string, homeTown: string): Friend[] {





    companyName = companyName ? companyName.toLocaleLowerCase() : null;
    collegeName = collegeName ? collegeName.toLocaleLowerCase() : null;
    homeTown = homeTown ? homeTown.toLocaleLowerCase() : null;
    
    if (companyName != null && collegeName == null && homeTown == null)
      return companyName ? value.filter((friend: Friend) => (friend.companyName.toLocaleLowerCase() == companyName)) : value;
    if (companyName != null && collegeName == null && homeTown == null)
      return companyName ? value.filter((friend: Friend) => (friend.companyName.toLocaleLowerCase() == companyName)) : value;
    if (companyName == null && collegeName != null && homeTown == null)
      return collegeName ? value.filter((friend: Friend) => (friend.collegeName.toLocaleLowerCase() == collegeName)) : value;
    if (companyName == null && collegeName == null && homeTown != null)
      return homeTown ? value.filter((friend: Friend) => (friend.homeTown.toLocaleLowerCase() == homeTown)) : value;
    if (companyName != null && collegeName != null && homeTown == null)
      return value.filter((friend: Friend) => (friend.companyName.toLocaleLowerCase() == companyName) && (friend.collegeName.toLocaleLowerCase() == collegeName))

    if (companyName != null && collegeName == null && homeTown != null)
      return value.filter((friend: Friend) => (friend.companyName.toLocaleLowerCase() == companyName) && (friend.homeTown.toLocaleLowerCase() == homeTown))

    if (companyName == null && collegeName != null && homeTown != null)
      return value.filter((friend: Friend) => (friend.homeTown.toLocaleLowerCase() == homeTown) && (friend.collegeName.toLocaleLowerCase() == collegeName))
    if (companyName != null && collegeName != null && homeTown != null)
      return value.filter((friend: Friend) => (friend.companyName.toLocaleLowerCase() == companyName) && (friend.collegeName.toLocaleLowerCase() == collegeName) && (friend.homeTown.toLocaleLowerCase() == homeTown))

  }

}